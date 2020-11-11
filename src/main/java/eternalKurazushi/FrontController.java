package eternalKurazushi;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import eternalKurazushi.model.Areas;
import eternalKurazushi.model.MenuModelForSearch;

@Controller
public class FrontController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String getResult(@RequestParam("radio_1") String eatTime, @RequestParam("radio_2") String areaString, Model model) {
		if (StringUtils.isEmpty(eatTime) || StringUtils.isEmpty(eatTime)) {
			return "error";
		}

		boolean isLunch = eatTime.equals("ランチ") ? true : false;
		Areas area = Areas.東日本;
		if (areaString.equals("西日本")) {
			area = Areas.西日本;
		} else if (areaString.equals("九州・沖縄")) {
			area = Areas.九州;
		}

		List<MenuModelForSearch> gachaResult = Gacha.getResult(area, isLunch);
		model.addAttribute("list", gachaResult);
		model.addAttribute("sum", getSumString(gachaResult));
		model.addAttribute("time", eatTime);
		model.addAttribute("area", areaString);
		return "result";
	}

	private String getSumString(List<MenuModelForSearch> gachaResult) {
		int sumPrice = 0;
		int sumKcal = 0;
		for (MenuModelForSearch menu : gachaResult) {
			sumPrice += menu.getPrice();
			sumKcal += menu.getKcal();
		}
		long sumPriceWithTax =  Math.round(sumPrice * 1.1);
		return "合計 " + sumPrice + "円（税込み " + sumPriceWithTax + "円） " + gachaResult.size() + "品" + sumKcal + "kcal";
	}
}

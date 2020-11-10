package eternalKurazushi.model;

import java.util.ArrayList;
import java.util.List;

public class MenuModelForSearch extends MenuModel{

	List<Areas> areas;
	boolean isLunch;

	public MenuModelForSearch(MenuModel menuModel) {
		super();
		this.name = menuModel.getName();
		this.price = menuModel.getPrice();
		this.kcal = menuModel.getKcal();
		this.area = menuModel.getArea();
		this.takeout = menuModel.getTakeout();
		this.type = menuModel.getType();
		this.areas = this.calculateAreas();
		this.isLunch = this.calculateIsLunch();
	}

	public List<Areas> calculateAreas() {
		List<Areas> res = new ArrayList<>();

		if (this.area.contains("全店舗") || this.area.contains("鈴蘭台店・ビナリオ梅田店") || this.area.isEmpty()) {
			res.add(Areas.東日本);
			res.add(Areas.西日本);
			res.add(Areas.九州);
			return res;
		}

		if(this.area.contains("東日本") || this.area.contains("関東")) {
			res.add(Areas.東日本);
		}

		if(this.area.contains("西日本") || this.area.contains("関西")) {
			res.add(Areas.西日本);
		}

		if(this.area.contains("九州")) {
			res.add(Areas.西日本);
		}

		return res;
	}

	public boolean calculateIsLunch() {
		boolean res = false;

		if (this.name.contains("平日限定17時まで")) {
			res  = true;
		}

		return res;
	}

	public List<Areas> getAreas(){
		return this.areas;
	}

	public boolean getIsLunch() {
		return this.isLunch;
	}

}

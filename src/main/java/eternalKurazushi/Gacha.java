package eternalKurazushi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import eternalKurazushi.cache.MenuCaches;
import eternalKurazushi.model.Areas;
import eternalKurazushi.model.MenuModelForSearch;

public class Gacha {

	public static List<MenuModelForSearch> getResult(Areas area, boolean isLunch){
		List<MenuModelForSearch> result  = new ArrayList<>();
		int threshold = getThreshold(isLunch);
		List<MenuModelForSearch> candidates = MenuCaches.getSingleton().getMenuList(area, isLunch);

		while (isOverThreshold(threshold, result) == false) {
			addElement(result, candidates);
		}

		checkIncludeLunchMenu(result);

		return result;
	}

	private static int getThreshold(boolean isLunch) {
		if (isLunch) {
			return 500;
		} else {
			return 1000;
		}
	}

	private static void addElement(List<MenuModelForSearch> result, List<MenuModelForSearch> candidates) {
		int size = candidates.size();
		Random random = new Random();
		int randomValue = random.nextInt(size);

		result.add(candidates.get(randomValue));
	}

	private static boolean isOverThreshold(int threshold, List<MenuModelForSearch> result) {
		float sum = 0;
		for (MenuModelForSearch menu : result) {
			sum += menu.getPrice();
		}

		sum *= 1.1;

		if (threshold < sum) {
			return true;
		} else {
			return false;
		}
	}

	private static void checkIncludeLunchMenu(List<MenuModelForSearch> result) {
		boolean isInclude = false;
		MenuModelForSearch lunch = null;
		for (MenuModelForSearch menu : result) {
			if (menu.getIsLunch() == true) {
				isInclude = true;
				lunch = menu;
				break;
			}
		}

		if (isInclude) {
			result.clear();
			result.add(lunch);
		}
	}

}

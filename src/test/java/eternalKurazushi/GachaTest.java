package eternalKurazushi;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import eternalKurazushi.model.Areas;
import eternalKurazushi.model.MenuModelForSearch;

public class GachaTest {

	@Test
	public void testGetResultWhenAreaIsEastAndLunch() {
		System.out.println("\n東日本 昼");
		List<MenuModelForSearch> result= Gacha.getResult(Areas.東日本, true);
		float sum = 0;
		for (MenuModelForSearch menu :result) {
			System.out.println(menu.getName() + " : " + menu.getPrice() + "円 : " + menu.getArea());
			sum += menu.getPrice();
		}
		sum *= 1.1;
		System.out.println("合計 : " + sum);
		assertTrue(sum > 500);
	}

	@Test
	public void testGetResultWhenAreaIsEastAndDinner() {
		System.out.println("\n東日本 夜");
		List<MenuModelForSearch> result= Gacha.getResult(Areas.東日本, false);
		float sum = 0;
		for (MenuModelForSearch menu :result) {
			System.out.println(menu.getName() + " : " + menu.getPrice() + "円 : " + menu.getArea());
			sum += menu.getPrice();
		}
		sum *= 1.1;
		System.out.println("合計 : " + sum);
		assertTrue(sum > 1000);
	}

	@Test
	public void testGetResultWhenAreaIsWestAndLunch() {
		System.out.println("\n西日本 昼");
		List<MenuModelForSearch> result= Gacha.getResult(Areas.西日本, true);
		float sum = 0;
		for (MenuModelForSearch menu :result) {
			System.out.println(menu.getName() + " : " + menu.getPrice() + "円 : " + menu.getArea());
			sum += menu.getPrice();
		}
		sum *= 1.1;
		System.out.println("合計 : " + sum);
		assertTrue(sum > 500);
	}

	@Test
	public void testGetResultWhenAreaIsWestAndDinner() {
		System.out.println("\n西日本 夜");
		List<MenuModelForSearch> result= Gacha.getResult(Areas.西日本, false);
		float sum = 0;
		for (MenuModelForSearch menu :result) {
			System.out.println(menu.getName() + " : " + menu.getPrice() + "円 : " + menu.getArea());
			sum += menu.getPrice();
		}
		sum *= 1.1;
		System.out.println("合計 : " + sum);
		assertTrue(sum > 1000);
	}

	@Test
	public void testGetResultWhenAreaIsKyusyuAndLunch() {
		System.out.println("\n九州 昼");
		List<MenuModelForSearch> result= Gacha.getResult(Areas.九州, true);
		float sum = 0;
		for (MenuModelForSearch menu :result) {
			System.out.println(menu.getName() + " : " + menu.getPrice() + "円 : " + menu.getArea());
			sum += menu.getPrice();
		}
		sum *= 1.1;
		System.out.println("合計 : " + sum);
		assertTrue(sum > 500);
	}

	@Test
	public void testGetResultWhenAreaIsKyusyuAndDinner() {
		System.out.println("\n九州 夜");
		List<MenuModelForSearch> result= Gacha.getResult(Areas.九州, false);
		float sum = 0;
		for (MenuModelForSearch menu :result) {
			System.out.println(menu.getName() + " : " + menu.getPrice() + "円 : " + menu.getArea());
			sum += menu.getPrice();
		}
		sum *= 1.1;
		System.out.println("合計 : " + sum);
		assertTrue(sum > 1000);
	}

}

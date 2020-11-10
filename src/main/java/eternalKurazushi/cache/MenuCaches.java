package eternalKurazushi.cache;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.seasar.doma.jdbc.tx.TransactionManager;

import eternalKurazushi.dao.MenuDao;
import eternalKurazushi.dao.MenuDaoImpl;
import eternalKurazushi.dao.RDBConfig;
import eternalKurazushi.model.Areas;
import eternalKurazushi.model.MenuModelForSearch;

public class MenuCaches {

	private static final MenuCaches SINGLETON = new MenuCaches();

	private List<MenuModelForSearch> menuList;

	TransactionManager tm = RDBConfig.singleton().getTransactionManager();
	MenuDao menuDao = new MenuDaoImpl();

	private MenuCaches() {
		super();
	}

	public void load() {
		List<MenuModelForSearch> li = new LinkedList<>();
		tm.required(() -> {
			menuDao.selectAll().forEach(menu -> {
				li.add(new MenuModelForSearch(menu));
			});
		});

		menuList = li;
		System.out.println("menu cache loaded");
	}

	public static MenuCaches getSingleton() {
		return SINGLETON;
	}

	public List<MenuModelForSearch> getMenuList(Areas area, boolean isLunch) {
		if (isLunch == true) {
			return menuList.stream()
					.filter(menu -> menu.getAreas().contains(area))
					.collect(Collectors.toList());
		} else {
			return menuList.stream()
					.filter(menu -> menu.getAreas().contains(area))
					.filter(menu -> menu.getIsLunch() == false)
					.collect(Collectors.toList());
		}

	}

}

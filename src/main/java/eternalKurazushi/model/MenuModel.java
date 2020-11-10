package eternalKurazushi.model;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

@Entity
@Table(name = "menu")
public class MenuModel {


	@Column(name = "name")
	public String name;
	@Column(name = "price")
	public int price;
	@Column(name = "kcal")
	public int kcal;
	@Column(name = "area")
	public String area;
	@Column(name = "takeout")
	public boolean takeout;
	@Column(name = "type")
	public String type;


	public MenuModel() {
		super();
	}

	public MenuModel(String name, int price, int kcal, String area, boolean takeout, String type) {
		super();
		this.name = name;
		this.price = price;
		this.kcal = kcal;
		this.area = area;
		this.takeout = takeout;
		this.type = type;

	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public int getKcal() {
		return this.kcal;
	}

	public String getArea() {
		return this.area;
	}

	public boolean getTakeout() {
		return this.takeout;
	}

	public String getType() {
		return this.type;
	}

}

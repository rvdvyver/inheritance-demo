package com.starcourt;

import com.starcourt.shops.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Mall {

	private List<Shop> shopList;

	public Mall() {
		shopList = new ArrayList<>();
		CoffeeShop coffeeShop = new CoffeeShop();

		shopList.add(coffeeShop);
		shopList.add(new ComicShop());
		shopList.add(new HobbyShop());
	}

	public void setAllAirConditionedShopsTemp() {
		System.out.println("All AirCon Shops");
		System.out.println("=========");

		for (Shop s : shopList) {
			if (s instanceof AirConditioned) {
				System.out.print("name " + s.getName() + " ");
				AirConditioned ac = (AirConditioned)s;
				ac.setTemperature(-1);
				System.out.println("temp = " + ac.getTemperature());
			}

		}
	}

	public void listShopsInMall() {
		System.out.println("All Shops");
		System.out.println("=========");

		for (Shop s : shopList) {
			System.out.println(s.getName());
		}
	}
}

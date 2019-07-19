package com.starcourt.shops;

public class CoffeeShop extends Shop implements AirConditioned {

	private int temp;

	public CoffeeShop() {
		name = "CoffeeShop";
	}

	@Override
	public void setTemperature(int t) {
		this.temp = t;
	}

	@Override
	public int getTemperature() {
		return temp;
	}
}

package com.starcourt.shops;

public class ComicShop extends Shop implements AirConditioned {

	private int temp;

	public ComicShop() {
		name = "ComicShop";
	}

	@Override
	public void setTemperature(int t) {
		temp = t;
	}

	@Override
	public int getTemperature() {
		return temp;
	}
}

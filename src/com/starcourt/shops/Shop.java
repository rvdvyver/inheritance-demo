package com.starcourt.shops;

public abstract class Shop {

	protected String name;
	protected boolean power;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
}

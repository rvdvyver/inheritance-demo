package com.starcourt.shops;

public interface AirConditioned {
	void setTemperature(int temp);
	int getTemperature();

	default void doSomething() {
		System.out.println("some");
	}
}

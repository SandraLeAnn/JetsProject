package com.skilldistillery.jets.entities;

public class CargoCarrier extends Jet implements CargoLoader {

	public CargoCarrier() {
		super();
		// TODO Auto-generated constructor stu
	
	}
	
	
	public CargoCarrier(String name, String model, long price, double speed, int range) {
		super(name, model, price, speed, range);
		// TODO Auto-generated constructor stub
	}


	public void callToInterfaceCC(){
		CargoLoader.loadCargo();
	}
	



}

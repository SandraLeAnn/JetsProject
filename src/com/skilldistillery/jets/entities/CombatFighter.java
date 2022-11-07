package com.skilldistillery.jets.entities;

public class CombatFighter extends Jet implements CombatReady{

	public CombatFighter() {
		super();
	}

	

	
	public CombatFighter(String name, String model, long price, double speed, int range) {
		super(name, model, price, speed, range);
		// TODO Auto-generated constructor stub
	}




	public void callToInterfaceCR() {
		CombatReady.fight();
	}
	
	
	
	
}

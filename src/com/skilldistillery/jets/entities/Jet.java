package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	
	private String name;
	private String model;
	private long price;
	protected double speed;
	protected int range;

	
	public Jet() {
		super();
	}

	public Jet(String name, String model, long price, double speed, int range) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.speed = speed;
		this.range = range;
	}

	public  String fly() {
		//Adjust formula to only show 2 decimal points
		double time = (this.speed/this.range);
		String str =  toString() + " " + "Hours till fuel runs out: " + time;
		return str;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	
	@Override
	public String toString() {
		return "Plane name: " + name + ", model: " + model + ", price: " + price + ", speed: " + speed + ", range: " + range;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, name, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(range) == Double.doubleToLongBits(other.range)
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}


}

package oop;

public class Car extends Vehicle {

	
	private int doors;
	private int enginecap;
	
	public Car(String name, int doors, int enginecap) {
		super(name);
		this.doors = doors;
		this.enginecap = enginecap;
	}
}

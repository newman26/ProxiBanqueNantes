package fr.adaming.model;



public class Customer {

	String name;
	int pin;
	


	public Customer(String name, int pin) {
		super();
		this.name = name;
		this.pin = pin;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

}

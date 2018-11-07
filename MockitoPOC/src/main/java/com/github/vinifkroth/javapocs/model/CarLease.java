package com.github.vinifkroth.javapocs.model;


public class CarLease {
	private Car car;
	private Person person;

	public String getLeaseInfo() {
		return "The car with plate: " + car.getCarPlate() + " is leased by: " + person.getName();
	}
}

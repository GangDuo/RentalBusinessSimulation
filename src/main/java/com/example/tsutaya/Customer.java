package com.example.tsutaya;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer(String name) {
		this._name = name;
	}

	public String getName() {
		return _name;
	}

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();

			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
		}

		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}
	
	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}

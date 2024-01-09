package com.example.tsutaya;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(int daysRented, Movie movie) {
        this._daysRented = daysRented;
        this._movie = movie;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }

	double getCharge() throws AssertionError {
		double result = 0;
		switch (getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (getDaysRented() > 2) {
				result += (getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (getDaysRented() > 3) {
				result += (getDaysRented() - 3) * 1.5;
			}
			break;
		default:
			throw new AssertionError();
		}
		return result;
	}
}

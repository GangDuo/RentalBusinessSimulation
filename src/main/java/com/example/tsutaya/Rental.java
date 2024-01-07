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
}

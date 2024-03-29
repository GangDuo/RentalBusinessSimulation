package com.example.tsutaya;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(int priceCode, String title) {
        this._priceCode = priceCode;
        this._title = title;
    }

    public String getTitle() {
        return _title;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int value) {
        this._priceCode = value;
    }
}

package com.example.tsutaya;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AppTest {
	@Test
	void shouldAnswerWithTrueForLongTermRental() {
		List<String> expected = Arrays.asList(
				"Rental Record for マーチン・ファウラー",
				"\tsun\t3.0",
				"\tmoon\t21.0",
				"\tpolice\t9.5",
				"Amount owed is 33.5",
				"You earned 4 frequent renter points");

		Customer c = new Customer("マーチン・ファウラー");
		c.addRental(new Rental(4, new Movie(Movie.CHILDRENS, "sun")));
		c.addRental(new Rental(7, new Movie(Movie.NEW_RELEASE, "moon")));
		c.addRental(new Rental(7, new Movie(Movie.REGULAR, "police")));
		String ss = c.statement();
		List<String> actual = Arrays.asList(ss.split("[\r\n]+"));
		assertLinesMatch(expected, actual);
	}
}

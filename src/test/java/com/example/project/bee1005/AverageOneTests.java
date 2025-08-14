package com.example.project.bee1005;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageOneTests {

    @Test
	void averageTestOne() {
		AverageOne media = new AverageOne();
		assertEquals(6.431818181818182, media.calcularMedia(5.0, 7.1), "5.0 + 7.1 should equal 6.431818181818182");
	}

	@Test
	void averageTestTwo() {
		AverageOne media = new AverageOne();
		assertEquals(4.840909090909091, media.calcularMedia(0.0, 7.1), "0.0 + 7.1 should equal 4.840909090909091");
	}

	@Test
	void averageTestThree() {
		AverageOne media = new AverageOne();
		assertEquals(10.00, media.calcularMedia(10.0, 10.0), "10.0 + 10.0 should equal 10.0");
	}
}

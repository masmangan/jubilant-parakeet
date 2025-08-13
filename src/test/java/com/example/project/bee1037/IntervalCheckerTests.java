package com.example.project.bee1037;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntervalCheckerTest {
	@Test
	@DisplayName("Intervalo [0,25]")
	void testLimitesInferiores() {
		assertEquals("Intervalo [0,25]", IntervalChecker.getIntervalMessage(0));
		assertEquals("Intervalo [0,25]", IntervalChecker.getIntervalMessage(25.0));
	}

	@Test
	@DisplayName("Intervalo (25,50]")
	void testLimitesMedios() {
		assertEquals("Intervalo (25,50]", IntervalChecker.getIntervalMessage(25.01));
		assertEquals("Intervalo (50,75]", IntervalChecker.getIntervalMessage(50.5));
		assertEquals("Intervalo (75,100]", IntervalChecker.getIntervalMessage(99.9));
	}

	@Test
	@DisplayName("Fora de intervalo")
	void testForaDeIntervalo() {
		assertEquals("Fora de intervalo", IntervalChecker.getIntervalMessage(-25.02));
		assertEquals("Fora de intervalo", IntervalChecker.getIntervalMessage(150));
	}
}
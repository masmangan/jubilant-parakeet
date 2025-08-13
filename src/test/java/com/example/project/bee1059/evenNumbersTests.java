package com.example.project.bee1059;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SomadorTests {

	@Test
	@DisplayName("even Numbers")
	void addsTenAndNine() {
		Even even = new Even();
		assertEquals([2,4,6,8] , even.evenNumbers(10), "Numeros pares de 0 a 10");
	}

}
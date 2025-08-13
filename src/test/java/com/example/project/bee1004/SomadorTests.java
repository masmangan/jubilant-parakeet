package com.example.project.bee1004;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SomadorTests {

	@Test
	@DisplayName("3 * 9 = 27")
	void multiplyThreeAndNine() {
		Somador somador = new Somador();
		assertEquals(27, somador.multiplicar(3, 9), "3 * 9 should equal 27");
	}

	@Test
	@DisplayName("-30 * 10 = -300")
	void multiplyMinusThirtyAndTen() {
		Somador somador = new Somador();
		assertEquals(-300, somador.multiplicar(-30, 10), "-30 * 10 should equal -300");
	}	

	@Test
	@DisplayName("0 * 9 = 0")
	void multiplyZeroAndNine() {
		Somador somador = new Somador();
		assertEquals(0, somador.multiplicar(0, 9), "0 * 9 should equal 0");
	}		
}
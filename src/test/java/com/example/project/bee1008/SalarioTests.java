package com.example.project.bee1008;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SalarioTests {

	@Test
	@DisplayName("100 hours, 5.50 dolars an hour")
	void multiply100And5_50() {
		Salario salario = new Salario();
		assertEquals(550.00, salario.calcular(100, 5.50), "100 hours, 5.50 dolars an hour results in 550.00");
	}

	@Test
	@DisplayName("200 hours, 20.50 dolars an hour")
	void multiply200And20_50() {
		Salario salario = new Salario();
		assertEquals(4100.00, salario.calcular(200, 20.50), "200 hours, 20.50 dolars an hour results in 4100.00");
	}	

	@Test
	@DisplayName("145 hours, 15.55 dolars an hour")
	void multiply145And15_55() {
		Salario salario = new Salario();
		assertEquals(2254.75, salario.calcular(145, 15.55), "145 hours, 15.55 dolars an hour results in 2254.75");
	}		
}
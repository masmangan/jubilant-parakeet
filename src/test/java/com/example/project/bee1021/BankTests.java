package com.example.project.bee1021;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankTests {

	@Test
	@DisplayName("Função contar com entrada: 576,73")
	void contarTest1() {
		Bank bank = new Bank();
		int[] ans = {5,1,1,0,1,0,1,1,0,2,0,3};
		assertArrayEquals(ans, bank.contar(576.73), "Erro! Resultado diferente de ans");
	}

	@Test
	@DisplayName("Função contar com entrada: 4")
	void contarTest2() {
		Bank bank = new Bank();
		int[] ans = {0,0,0,0,0,2,0,0,0,0,0,0};
		assertArrayEquals(ans, bank.contar(4), "Erro! Resultado diferente de ans");
	}
	
	@Test
	@DisplayName("Função contar com entrada: 91.01")
	void contarTest3() {
		Bank bank = new Bank();
		int[] ans = {0,1,2,0,0,0,1,0,0,0,0,1};
		assertArrayEquals(ans, bank.contar(91.01), "Erro! Resultado diferente de ans");	
	}
}
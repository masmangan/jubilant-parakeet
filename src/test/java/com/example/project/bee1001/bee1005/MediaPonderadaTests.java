
/* Casos de Teste propostos no enunciado 
 * 
 * NotaA = 5.0 NotaB = 7.1 a média (com a formatação proposta pelo enunciado) será: 6.43182;
 * NotaA = 0.0 NotaB = 7.1 a média (com a formatação proposta pelo enunciado) será: 4.84091;
 * NotaA = 10.0 NotaB = 10.0 a média (com a formatação proposta pelo enunciado) será: 10.0;
*/
package com.example.project.bee1001;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MediaPonderadaTests {

	@Test
	@DisplayName("Quando A é 5.0 e B é 7.1 a média formatada devera ser 6.43182")
	void mediaP1() {
		MediaPonderada mp= new MediaPonderada();
		assertEquals(6.43182, mp.media(5.0, 7.1), "A média ponderada entre 5.0 e 7.1 deveria ser 6.43182");
	}

	@Test
	@DisplayName("Quando A é 0.0 e B é 7.1 a média formatada devera ser 4.84091")
	void mediaP2() {
		MediaPonderada mp= new MediaPonderada();
		assertEquals(4.84091, mp.media(0.0, 7.1), "A média ponderada entre 0.0 e 7.1 deveria ser 4.84091");
	}	

	@Test
	@DisplayName("Quando A é 10.0 e B é 10.0 a média formatada devera ser 10.0")
	void mediaP3() {
		MediaPonderada mp= new MediaPonderada();
		assertEquals(10, mp.media(10.0, 10.0), "A média ponderada entre 10.0 e 10.0 deveria ser 10.0");
	}		
}
package br.edu.infnet.appRoupa.model.negocio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CamisaTest {
	
	@Test
	void testValorFinal () {
		Camisa camisa = new Camisa("Com Manga", "Marca B", 30, Boolean.FALSE);
		camisa.setGola(Boolean.TRUE);
		camisa.setCor("verde");
		
		assertTrue(camisa.valorVenda() == 30);
	}
}

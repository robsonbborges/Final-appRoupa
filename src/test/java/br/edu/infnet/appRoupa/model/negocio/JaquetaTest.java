package br.edu.infnet.appRoupa.model.negocio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class JaquetaTest {
	
	@Test
	void testValorFinal () {
		Jaqueta jaqueta = new Jaqueta("Couro", "Marca C", 100, Boolean.TRUE);
		jaqueta.setBolso(2);
		jaqueta.setCapuz(Boolean.TRUE);
		
		
		assertTrue(jaqueta.valorVenda() == 60);
	
	
	}
}

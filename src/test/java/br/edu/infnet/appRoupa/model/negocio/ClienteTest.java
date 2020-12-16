package br.edu.infnet.appRoupa.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class ClienteTest {
	
	@Test
	void testInstancia() {
		Cliente s = null;
				
		s = new Cliente("robson", "robson@email.com", "98765432109");
		
		assertNotNull(s);
	}
	
	@Test	
	void testToString() {
		Cliente s = null;
		
		s = new Cliente("robson", "robson@email.com", "98765432109");

	}

		
}
 
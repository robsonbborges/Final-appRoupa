package br.edu.infnet.appRoupa.model.negocio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class VendaTest {
	
	@Test
	void testAssociacao() {
		Cliente s =  new Cliente("robson", "robson@email.com", "98765432109");
		
		Venda venda = new Venda();
		venda.setCliente(s);
		
		assertTrue(s.equals(venda.getCliente()));
	}
	
	@Test
	void testInternet() {
		Cliente s =  new Cliente("robson", "robson@email.com", "98765432109");
		
		Venda venda = new Venda();
		venda.setCliente(s);
		
		assertTrue(venda.isWeb());
	}
	
	@Test
	void testBalcao() {
		Cliente s =  new Cliente("robson", "robson@email.com", "98765432109");
		
		Venda venda = new Venda();
		venda.setWeb(Boolean.FALSE);
		venda.setCliente(s);
		
		assertFalse(venda.isWeb());
		
	}
	
	@Test
	void testToString() {
		Cliente s =  new Cliente("robson", "robson@email.com", "98765432109");
		
		Venda venda = new Venda();
		venda.setWeb(Boolean.FALSE);
		venda.setCliente(s);
		
		System.out.println(venda);
		
	}


}

package br.edu.infnet.appRoupa.model.negocio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

public class RoupaTest {
	
	@Test
	void testBermuda() {
		Bermuda bermuda = null;
		
		bermuda = new Bermuda("Jeans", "Marca A", 40, Boolean.TRUE);
		
		assertNotNull(bermuda);
	}
	
	@Test
	void testToStringBermuda() {
		Bermuda bermuda = new Bermuda("Jeans", "Marca A", 40, Boolean.TRUE);

		
	}
	
	@Test
	void testCamisa() {
		Camisa camisa = null;
		
		camisa = new Camisa("Com Manga", "Marca B", 30, Boolean.FALSE);
		
		assertNotNull(camisa);
	}
	
	@Test
	void testToStringCamisa() {
		Camisa camisa = new Camisa("Com Manga", "Marca B", 30, Boolean.FALSE);
		
	}
	
	@Test
	void testJaqueta() {
		Jaqueta jaqueta = null;
		
		jaqueta = new Jaqueta("Couro", "Marca C", 100, Boolean.TRUE);
		
		assertNotNull(jaqueta);
	}
	
	@Test
	void TestToStringJaqueta() {
		Jaqueta jaqueta = new Jaqueta("Couro", "Marca C", 100, Boolean.TRUE);
		

	}
	

}

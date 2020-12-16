package br.edu.infnet.appRoupa.model.negocio;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.infnet.appRoupa.model.exception.ComplementoInvalidoException;
import br.edu.infnet.appRoupa.model.exception.MedadaInvalidaException;

public class BermudaTest {
	
	@Test
	void testInstancia() throws MedadaInvalidaException {
		Bermuda bermuda = new Bermuda("Curta", "Marca A", 40, Boolean.TRUE);
		try {
			bermuda.setTamanho(40);
		} catch (ComplementoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bermuda.setTecido("Jeans");
		
	}

	@Test
	void testValorFinal () throws MedadaInvalidaException {
		Bermuda bermuda = new Bermuda("Curta", "Marca A", 40, Boolean.TRUE);
		try {
			bermuda.setTamanho(40);
		} catch (ComplementoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bermuda.setTecido("Jeans");
		
		assertTrue(bermuda.valorVenda() == 20);
		
		 {
			
		}
	}
}

package br.edu.infnet.appRoupa.model.leitura;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;

import br.edu.infnet.appRoupa.model.negocio.Bermuda;
import br.edu.infnet.appRoupa.model.negocio.Camisa;
import br.edu.infnet.appRoupa.model.negocio.Jaqueta;


public class ArquivoTeste {

	private static final int ComplementoInvalidoException = 0;
	private static final int IOException = 0;

	public static void main(String[] args) throws Exception {
		
		String dir = "C:/dev/workspace20E4/App/src/";
		String arq = "pedidos.txt";

		try {
			String linha;
			String[] campos = linha.split(";");
			
			switch (campos[0].toUpperCase()) {
			case "E":
				//Regra geral pra todas as filhas
				Bermuda bermuda = new Bermuda(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
				//
				Bermuda.setTamanho(Float.valueOf(campos[4]));
				eletronico.setMarca(campos[5]);
				out.write(bermuda.obterValorFinal());
				break;

			case "T":
				//Regra geral pra todas as filhas
				Camisa camisa = new CAmisa(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
				//
				Camisa.setGola(Boolean.valueOf(campos[4]));
				camisa.setCor(campos[5]);
			
				out.write(camisa.obterValorPorFinal());
				break;
			
			case "C":
				//Regra geral pra todas as filhas
				Jaqueta Jaqueta = new Jaqueta(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
				//
				jaqueta.setCapuz(Boolean.valueOf(campos[4]));
				jaqueta.setCapuz(campos[5]);
				
				out.write(card.obterValorPorProduto());
				
				break;
			}
			
			in.close();
			leitura.close();
			
			out.close();
			escrita.close();
			
			System.out.println("Compra de roupas realizada com sucesso.");
			
		} catch ( IOException | ComplementoInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}
package br.edu.infnet.appRoupa.model.negocio;

import br.edu.infnet.appRoupa.model.exception.ComplementoInvalidoException;
import br.edu.infnet.appRoupa.model.exception.CorInvalidaException;

public class Camisa extends Roupa {

	private boolean gola;
	private String cor;
	
	public Camisa(String descricao, String marca, float valor, boolean promocao) {
		super(descricao, marca, valor, promocao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(';');
		sb.append(this.isGola());
		sb.append(";");
		sb.append(this.getCor());
		
		return sb.toString();
	}
	
	@Override
	public float valorVenda() {

		float valorPromocao = 0;
		if(this.isPromocao()) {
			valorPromocao = 2;
		}

		return this.getValor() / valorPromocao + (this.isGola() ? 2 : 0);
	}

	
	
	
	public boolean isGola() {
		return gola;
	}

	public void setGola(boolean gola) {
		this.gola = gola;
	}

	public String getCor() {
		return cor;
	}

	public void setCor (String cor) throws CorInvalidaException {
		if(cor = null) {
			throw new CorInvalidaException ("Cor Invalida.");
		}
		
		this.cor = cor;
		
	}
}

package br.edu.infnet.appRoupa.model.negocio;

import br.edu.infnet.appRoupa.model.exception.BolsoInvalidoException;
import br.edu.infnet.appRoupa.model.exception.CorInvalidaException;

public class Jaqueta extends Roupa {
	
	private int bolso;
	private boolean capuz;

	public Jaqueta(String descricao, String marca, float valor, boolean promocao) {
		super(descricao, marca, valor, promocao);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(this.getBolso());
		sb.append(";");
		sb.append(this.isCapuz());
		
		return sb.toString();
	}

	@Override
	public float valorVenda() {
		
		float valorPromocao = 0;
		if(this.isPromocao()) {
			valorPromocao = 2;
		}
		return this.getValor() / valorPromocao + (this.isCapuz() ? 10 : 0);
	}

	public int getBolso() {
		return bolso;
	}

	public void setBolso (int bolso) throws BolsoInvalidoException {
		if(bolso <= 0) {
			throw new BolsoInvalidoException ("Quantidade Invalida.");
		}
		
		this.bolso = bolso;
	}

	public boolean isCapuz() {
		return capuz;
	}

	public void setCapuz(boolean capuz) {
		this.capuz = capuz;
	}

	
}

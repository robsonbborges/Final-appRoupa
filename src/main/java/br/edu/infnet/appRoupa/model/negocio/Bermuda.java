package br.edu.infnet.appRoupa.model.negocio;

import br.edu.infnet.appRoupa.model.exception.ComplementoInvalidoException;

public class Bermuda extends Roupa {

	private float tamanho;
	private String tecido;
	
	
	
	public Bermuda(String descricao, String marca, float valor, boolean promocao) {
		super(descricao, marca, valor, promocao);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";'");
		sb.append(this.getTamanho());
		sb.append(';');
		sb.append(this.getTecido());
		
		return sb.toString();
	}
	
	
	@Override
	public float valorVenda() {
		
		float valorPromocao = 0;
		if(this.isPromocao()) {
			valorPromocao = 2;
		}

		return this.getValor() / valorPromocao;
	}

	public float getTamanho() {
		return tamanho;
	}

	public void setTamanho(float tamanho) throws ComplementoInvalidoException {
		this.tamanho = tamanho;
		
		if(tamanho <=0) {
			throw new ComplementoInvalidoException ("Tamanha Indisponivel.");
		}
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}
	
	

}

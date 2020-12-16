package br.edu.infnet.appRoupa.model.negocio;

public abstract class Roupa {
	
	private String descricao;
	private String marca;
	private float valor;
	private boolean promocao;

	public Roupa(String descricao, String marca, float valor, boolean promocao) {
		this.descricao = descricao;
		this.marca = marca;
		this.valor = valor;
		this.promocao = promocao;
	}

	public abstract float valorVenda();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getDescricao());
		sb.append(';');
		sb.append(this.getMarca());
		sb.append(';');
		sb.append(this.getValor());
		sb.append(';');
		sb.append(this.isPromocao());


		return sb.toString();
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String getMarca() {
		return marca;
	}

	public float getValor() {
		return valor;
	}

	public boolean isPromocao() {
		return promocao;
	}

}

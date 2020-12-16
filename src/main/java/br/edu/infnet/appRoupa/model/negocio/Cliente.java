package br.edu.infnet.appRoupa.model.negocio;

public class Cliente { 
	private String nome;
	private String email;
	private String cpf;
	
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getEmail());
		sb.append(";'");
		sb.append(this.getCpf());
	
		return sb.toString(); 
	}
	
	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getCpf() {
		return cpf;
	}


}

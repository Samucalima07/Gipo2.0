package br.com.fiap.beans;

public class Login_Criador {
	
	private String email_criador;
	private String senhar_criador;
	
	public Login_Criador() {
		super();
	}

	public Login_Criador(String email_criador, String senhar_criador) {
		super();
		this.email_criador = email_criador;
		this.senhar_criador = senhar_criador;
	}

	public String getEmail_criador() {
		return email_criador;
	}

	public void setEmail_criador(String email_criador) {
		this.email_criador = email_criador;
	}

	public String getSenhar_criador() {
		return senhar_criador;
	}

	public void setSenhar_criador(String senhar_criador) {
		this.senhar_criador = senhar_criador;
	}
	
	

}

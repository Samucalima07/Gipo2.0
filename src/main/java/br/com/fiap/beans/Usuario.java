package br.com.fiap.beans;

public class Usuario{

	private int id_usuario;
	private int id_fase;
	private String email;
	private String nome_completo;
	private String senha;
	private String cep;
	private String logradouro;
	private String complemento;
	private String localidade;
	private String bairro;
	private String uf;
	
	public Usuario() {
		super();
	}

	public Usuario(int id_usuario, int id_fase, String email, String nome_completo, String senha, String cep,
			String logradouro, String complemento, String localidade, String bairro, String uf) {
		super();
		this.id_usuario = id_usuario;
		this.id_fase = id_fase;
		this.email = email;
		this.nome_completo = nome_completo;
		this.senha = senha;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.localidade = localidade;
		this.bairro = bairro;
		this.uf = uf;
	}

	public Usuario(int id_usuario, int id_fase, String email, String nome_completo, String senha) {
		super();
		this.id_usuario = id_usuario;
		this.id_fase = id_fase;
		this.email = email;
		this.nome_completo = nome_completo;
		this.senha = senha;
	}

	public Usuario(String cep, String logradouro, String complemento, String localidade, String bairro, String uf) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.localidade = localidade;
		this.bairro = bairro;
		this.uf = uf;
	}
	
	public Usuario(int id_usuario) {
		super();
		this.id_usuario = id_usuario;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_fase() {
		return id_fase;
	}

	public void setId_fase(int id_fase) {
		this.id_fase = id_fase;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	
}

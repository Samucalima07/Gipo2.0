package br.com.fiap.beans;

public class Fases {
	
	private int id_fase;
	private int id_cont_fase;
	private String titulo_fase;
	private String descricao_fase;
	private int id_pergunta;
	private String desc_pergunta;
	private int id_alternativa;
	private String desc_alternativa;
	
	public Fases() {
		super();
	}

	public Fases(int id_fase, int id_cont_fase, String titulo_fase, String descricao_fase, int id_pergunta,
			String desc_pergunta, int id_alternativa, String desc_alternativa) {
		super();
		this.id_fase = id_fase;
		this.id_cont_fase = id_cont_fase;
		this.titulo_fase = titulo_fase;
		this.descricao_fase = descricao_fase;
		this.id_pergunta = id_pergunta;
		this.desc_pergunta = desc_pergunta;
		this.id_alternativa = id_alternativa;
		this.desc_alternativa = desc_alternativa;
	}

	public int getId_fase() {
		return id_fase;
	}

	public void setId_fase(int id_fase) {
		this.id_fase = id_fase;
	}

	public int getId_cont_fase() {
		return id_cont_fase;
	}

	public void setId_cont_fase(int id_cont_fase) {
		this.id_cont_fase = id_cont_fase;
	}

	public String getTitulo_fase() {
		return titulo_fase;
	}

	public void setTitulo_fase(String titulo_fase) {
		this.titulo_fase = titulo_fase;
	}

	public String getDescricao_fase() {
		return descricao_fase;
	}

	public void setDescricao_fase(String descricao_fase) {
		this.descricao_fase = descricao_fase;
	}

	public int getId_pergunta() {
		return id_pergunta;
	}

	public void setId_pergunta(int id_pergunta) {
		this.id_pergunta = id_pergunta;
	}

	public String getDesc_pergunta() {
		return desc_pergunta;
	}

	public void setDesc_pergunta(String desc_pergunta) {
		this.desc_pergunta = desc_pergunta;
	}

	public int getId_alternativa() {
		return id_alternativa;
	}

	public void setId_alternativa(int id_alternativa) {
		this.id_alternativa = id_alternativa;
	}

	public String getDesc_alternativa() {
		return desc_alternativa;
	}

	public void setDesc_alternativa(String desc_alternativa) {
		this.desc_alternativa = desc_alternativa;
	}
	
	

}

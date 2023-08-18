package br.com.fiap.beans;

public class Progresso {
	
	private int id_progresso;
	private int id_fase;
	private int id_usuario;
	private String dt_incio_fase;
	private String hr_inicio_fase;
	private String dt_fim_fase;
	private String hr_fim_fase;
	
	public Progresso() {
		super();
	}

	public Progresso(int id_progresso, int id_fase, int id_usuario, String dt_incio_fase, String hr_inicio_fase,
			String dt_fim_fase, String hr_fim_fase) {
		super();
		this.id_progresso = id_progresso;
		this.id_fase = id_fase;
		this.id_usuario = id_usuario;
		this.dt_incio_fase = dt_incio_fase;
		this.hr_inicio_fase = hr_inicio_fase;
		this.dt_fim_fase = dt_fim_fase;
		this.hr_fim_fase = hr_fim_fase;
	}

	public int getId_progresso() {
		return id_progresso;
	}

	public void setId_progresso(int id_progresso) {
		this.id_progresso = id_progresso;
	}

	public int getId_fase() {
		return id_fase;
	}

	public void setId_fase(int id_fase) {
		this.id_fase = id_fase;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getDt_incio_fase() {
		return dt_incio_fase;
	}

	public void setDt_incio_fase(String dt_incio_fase) {
		this.dt_incio_fase = dt_incio_fase;
	}

	public String getHr_inicio_fase() {
		return hr_inicio_fase;
	}

	public void setHr_inicio_fase(String hr_inicio_fase) {
		this.hr_inicio_fase = hr_inicio_fase;
	}

	public String getDt_fim_fase() {
		return dt_fim_fase;
	}

	public void setDt_fim_fase(String dt_fim_fase) {
		this.dt_fim_fase = dt_fim_fase;
	}

	public String getHr_fim_fase() {
		return hr_fim_fase;
	}

	public void setHr_fim_fase(String hr_fim_fase) {
		this.hr_fim_fase = hr_fim_fase;
	}
	
	
}

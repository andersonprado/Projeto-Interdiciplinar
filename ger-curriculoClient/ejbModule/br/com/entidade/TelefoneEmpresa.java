package br.com.entidade;

import java.io.Serializable;

public class TelefoneEmpresa implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int codEmpresa;
	private String telefone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

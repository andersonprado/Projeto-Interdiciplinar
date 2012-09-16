package br.com.entidade;

import java.io.Serializable;

public class Telefone implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private int codUsuario;
	private String telefone;
	private TipoDeTelefone tipoDeTelefone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public TipoDeTelefone getTipoDeTelefone() {
		return tipoDeTelefone;
	}

	public void setTipoDeTelefone(TipoDeTelefone tipoDeTelefone) {
		this.tipoDeTelefone = tipoDeTelefone;
	}

}

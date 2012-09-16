package br.com.entidade;

import java.io.Serializable;

public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String user;
	private String senha;
	private TipoDeTelefone tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoDeTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeTelefone tipo) {
		this.tipo = tipo;
	}

}
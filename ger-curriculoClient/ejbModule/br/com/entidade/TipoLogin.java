package br.com.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tipo_login")
public class TipoLogin implements Serializable {
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_tipo")
	private int codTipoLogin;
	@Column(name = "nome_tipo")
	private String nomeTipo;

	public int getcodTipoLogin() {
		return codTipoLogin;
	}

	public void setcodTipoLogin(int codTipoLogin) {
		this.codTipoLogin = codTipoLogin;
	}

	public String getnomeTipo() {
		return nomeTipo;
	}

	public void setnomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}

	

}

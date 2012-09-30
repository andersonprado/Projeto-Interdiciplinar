package br.com.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_empresa")
	private int codEmpresa;
	@Column(name = "nome_empresa")
	private String nome;
	private String cnpj;

//	 @OneToMany
//	 private List<TelefoneEmpresa> telefones;
//	 @OneToOne
//	 private EnderecoEmpresa endereco;

	public int getCodEmpresa() {
		return codEmpresa;
	}

	public void setCodEmpresa(int codEmpresa) {
		this.codEmpresa = codEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

//	public List<TelefoneEmpresa> getTelefones() {
//		return telefones;
//	}
//
//	public void setTelefones(List<TelefoneEmpresa> telefones) {
//		this.telefones = telefones;
//	}
//
//	public EnderecoEmpresa getEndereco() {
//		return endereco;
//	}
//
//	public void setEndereco(EnderecoEmpresa endereco) {
//		this.endereco = endereco;
//	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

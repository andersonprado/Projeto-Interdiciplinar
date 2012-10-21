package br.com.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "curriculo")
public class Curriculo implements Serializable {
	@Transient
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_curriculo")
	private int id;
	
	@OneToMany(mappedBy = "curriculo")
	private List<CurriculoCursos> cursos;

	@OneToMany(mappedBy = "curriculo")
	private List<CurriculoEmpresa> empresas;

	@OneToOne
	private Usuario usuario;

	@OneToOne
	private AreaAtuacao areaAtuacao;

	public int getIdCurriculo() {
		return id;
	}

	public void setIdCurriculo(int idCurriculo) {
		this.id = idCurriculo;
	}


	public List<CurriculoEmpresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<CurriculoEmpresa> empresas) {
		this.empresas = empresas;
	}

	public List<CurriculoCursos> getCursos() {
		return cursos;
	}

	public void setCursos(List<CurriculoCursos> cursos) {
		this.cursos = cursos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public AreaAtuacao getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(AreaAtuacao areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public int hashCode() {
		
		return getIdCurriculo();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curriculo other = (Curriculo) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

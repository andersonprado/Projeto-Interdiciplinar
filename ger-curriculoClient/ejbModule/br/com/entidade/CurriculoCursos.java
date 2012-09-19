package br.com.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "curriculo_curso")
public class CurriculoCursos implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int idCurriculoCurso;
	private Curso curso;
	private Date dataInicio;
	private Date datatermino;
	private String horas;

	public int getIdCurriculoCurso() {
		return idCurriculoCurso;
	}

	public void setIdCurriculoCurso(int idCurriculoCurso) {
		this.idCurriculoCurso = idCurriculoCurso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDatatermino() {
		return datatermino;
	}

	public void setDatatermino(Date datatermino) {
		this.datatermino = datatermino;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

}

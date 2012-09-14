package br.com.entidade;

import java.io.Serializable;
import java.util.List;

public class Curriculo implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idCurriculo;
	private int codUsuario;
	private List<CurriculoCursos> cursos;
	private List<CurriculoEmpresa> empresas;

	public int getIdCurriculo() {
		return idCurriculo;
	}

	public void setIdCurriculo(int idCurriculo) {
		this.idCurriculo = idCurriculo;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
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

}

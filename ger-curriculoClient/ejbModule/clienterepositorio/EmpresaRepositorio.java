package clienterepositorio;

import java.util.List;

import br.com.entidade.Empresa;

public interface EmpresaRepositorio {

	public void adiciona(Empresa empresa);

	public List<Empresa> getEmpresas();
}
package clienterepositorio;

import java.util.List;

import br.com.entidade.AreaAtuacao;

public interface AreaAtuacaoRepositorio {

	public void adiciona(AreaAtuacao area);

	public List<AreaAtuacao> getListaArea();
}

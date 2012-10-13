package clienterepositorio;

import java.util.List;

import br.com.entidade.TipoLogin;

public interface TipoLoginRepositorio {
	public void adiciona(TipoLogin tipo);

	public TipoLogin getTipo(int codigo);

	public List<TipoLogin> getTipoLogin();
}

package clienterepositorio;

import java.util.List;

import br.com.entidade.Usuario;

public interface UsuarioRepositorio {

	public void adiciona(Usuario usuario);

	public List<Usuario> getUsuarios();
}

package clienterepositorio;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import br.com.entidade.Usuario;

@Stateless
@Local(UsuarioRepositorio.class)
public class UsuarioRepositorioImplement implements UsuarioRepositorio {
	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Usuario usuario) {
		manager.persist(usuario);
	}

	@Override
	public List<Usuario> getUsuarios() {
		TypedQuery<Usuario> query = manager.createQuery(
				"select cl from Empresa cl", Usuario.class);

		return query.getResultList();
	}
}

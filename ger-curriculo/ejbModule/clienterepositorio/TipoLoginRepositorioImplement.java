package clienterepositorio;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import br.com.entidade.TipoLogin;

@Stateless
@Remote(TipoLoginRepositorio.class)
public class TipoLoginRepositorioImplement implements TipoLoginRepositorio {

	@PersistenceContext
	private EntityManager manager2;

	@Override
	public void adiciona(TipoLogin tipo) {
		manager2.getTransaction().begin();
		manager2.persist(tipo);
		manager2.getTransaction().commit();
	}

	@Override
	public List<TipoLogin> getTipoLogin() {
		TypedQuery<TipoLogin> query = manager2.createQuery(
				"select cl from TipoLogin cl", TipoLogin.class);

		return query.getResultList();
	}

}

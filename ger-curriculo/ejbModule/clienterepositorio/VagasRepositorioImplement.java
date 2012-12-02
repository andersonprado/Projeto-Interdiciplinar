package clienterepositorio;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import br.com.entidade.Vagas;

@Stateless
@Remote(VagasRepositorio.class)
public class VagasRepositorioImplement implements VagasRepositorio {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adiciona(Vagas vaga) {
		manager.persist(vaga);

	}

	@Override
	public void atualiza(Vagas vaga) {
		manager.merge(vaga);

	}

	@Override
	public List<Vagas> getLista() {
		TypedQuery<Vagas> query = manager.createQuery(
				"select cl from Vagas cl", Vagas.class);

//		Query query = manager.createNamedQuery("Vagas.findAll");
		List<Vagas> lista = query.getResultList();
		return lista;
	}

	@Override
	public Vagas getVaga(int cod) {
		return manager.find(Vagas.class, cod);
	}

}

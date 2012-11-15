package clienterepositorio;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.entidade.Curriculo;

@Stateless
@Remote(CurriculoRepositorio.class)
public class CurriculoRepositorioImplement implements CurriculoRepositorio {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Curriculo> getLista() {
		TypedQuery<Curriculo> query = manager.createQuery(
				"select cl from Curriculo cl ", Curriculo.class);

		return query.getResultList();
	}

	@Override
	public void adiciona(Curriculo curriculo) {
		manager.persist(curriculo);

	}

	@Override
	public void atualiza(Curriculo curriculo) {
		manager.merge(curriculo);

	}

	@Override
	public Curriculo getCurriculo(int cod) {
		return manager.find(Curriculo.class, cod);
	}

}

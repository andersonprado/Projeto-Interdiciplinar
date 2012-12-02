package clienterepositorio;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import br.com.entidade.CurriculoVaga;

@Stateless
@Remote(CurriculoVagaRepositorio.class)
public class CurriculoVagaRepositorioImplement implements
		CurriculoVagaRepositorio {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public void adiciona(CurriculoVaga curVaga) {
		manager.persist(curVaga);

	}

	@Override
	public void atualiza(CurriculoVaga curEmpresa) {
		manager.merge(curEmpresa);

	}

	@Override
	public List<CurriculoVaga> getLista() {
		TypedQuery<CurriculoVaga> query = manager.createQuery(
				"select cl from CurriculoVaga cl ", CurriculoVaga.class);

		return query.getResultList();
	}

	@Override
	public CurriculoVaga getCurriculoVaga(int cod) {
		return manager.find(CurriculoVaga.class, cod);
	}

}

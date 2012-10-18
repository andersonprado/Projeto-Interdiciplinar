package managedbean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import clienterepositorio.CurriculoRepositorio;
import br.com.entidade.Curriculo;

@ManagedBean
@RequestScoped
public class CadCurriculoMB {
	@EJB
	private CurriculoRepositorio repositorio;
	private Curriculo curriculo = new Curriculo();
	

	public String adiciona() {
		repositorio.adiciona(this.curriculo);
		this.curriculo = new Curriculo();
		return "";
	}

//	public List<AreaAtuacao> getListaAreas() {
//		if (this.areacache == null) {
//			this.areacache = this.repositorio.getListaArea();
//
//		}
//		return this.areacache;
//	}

	public AreaAtuacao getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(Curriculo curriculo) {
		this.curriculo = curriculo;
	}

}

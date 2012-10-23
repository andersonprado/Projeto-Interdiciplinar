package managedbean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import clienterepositorio.UsuarioRepositorio;
import br.com.entidade.Curriculo;
import br.com.entidade.Usuario;

@ManagedBean
@RequestScoped
public class CadastroDadosCurriculoMB {
	@EJB
	private UsuarioRepositorio repositorio;
	
	private Usuario usuario = new Usuario();
	//Pega usuario da Sessao
	
	public String adicionaDados() {
	
		
		this.usuario = new Usuario();
		
		return "";
	}
	public String modifica() {
		
		return "";
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

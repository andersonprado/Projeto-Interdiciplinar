package br.com.jpa.criar;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.entidade.*;

public class GeraTabelas {
	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();

		cfg.addAnnotatedClass(AreaAtuacao.class);
		cfg.addAnnotatedClass(CandidatoVaga.class);
		cfg.addAnnotatedClass(Curriculo.class);
		cfg.addAnnotatedClass(CurriculoCursos.class);
		cfg.addAnnotatedClass(CurriculoEmpresa.class);
		cfg.addAnnotatedClass(Curso.class);
		cfg.addAnnotatedClass(Empresa.class);
		cfg.addAnnotatedClass(Endereco.class);
		cfg.addAnnotatedClass(EnderecoEmpresa.class);
		cfg.addAnnotatedClass(Login.class);
		cfg.addAnnotatedClass(Telefone.class);
		cfg.addAnnotatedClass(TelefoneEmpresa.class);
		cfg.addAnnotatedClass(TipoDeTelefone.class);
		cfg.addAnnotatedClass(TipoLogin.class);
		cfg.addAnnotatedClass(Usuario.class);
		cfg.addAnnotatedClass(Vagas.class);

		SchemaExport se = new SchemaExport(cfg);
		se.create(true, true);

	}
}

package br.com.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	// Barra de Menu
	private JMenuBar jmPrincipal = new JMenuBar();

	// Cria menu na barra

	private JMenu jmArquivo = new JMenu("Arquivo");
	private JMenu jmCadastro = new JMenu("Cadastro");
	private JMenu jmAprovacao = new JMenu("Aprova��o");
	private JMenu jmSelecao = new JMenu("Sele��o");
	private JMenu jmAdmin = new JMenu("Admin");

	// Cria item de menu dentro de menu cadastro
	private JMenuItem jmItemVagas = new JMenuItem("Vagas");
	private JMenuItem jmItemFornecedor = new JMenuItem("Fornecedor");
	private JMenuItem jmItemFechar = new JMenuItem("Fechar");
	private JMenuItem jmItemSelecao = new JMenuItem("Sele��o de Curriculos");
	private JMenuItem jmItemAreaAtuacao = new JMenuItem(
			"Alterar dados Area Atua��o");
	private JMenuItem jmItemUniversidade = new JMenuItem(
			"Alterar dados Universidades");
	private JMenuItem jmItemDadosEmpresa = new JMenuItem(
			"Alterar dados Empresa");

	// cria objeto jdPane do tipo JDesktopPane. Colocado dentro de JFrame
	public JDesktopPane jdPane = new JDesktopPane();

	// janelas JInternalFrame da aplica��o
	public Tela telaVagas, telaAprovacao, telaSelecao, telaAreaAtuacao,
			telaUniversidades, telaDadosEmpresa;

	public Menu() {
		// add JDesktopPane ao JFrame
		getContentPane().add(jdPane);

		// add menu � barra de menus jmPrincipal
		jmPrincipal.add(jmArquivo);
		jmPrincipal.add(jmCadastro);
		jmPrincipal.add(jmAprovacao);
		jmPrincipal.add(jmSelecao);
		jmPrincipal.add(jmAdmin);

		// add item ao menu
		jmArquivo.add(jmItemFechar);
		jmCadastro.add(jmItemVagas);
		jmAprovacao.add(jmItemFornecedor);
		jmSelecao.add(jmItemSelecao);
		jmAdmin.add(jmItemAreaAtuacao);
		jmAdmin.add(jmItemUniversidade);
		jmAdmin.add(jmItemDadosEmpresa);

		// add minemonic

		jmArquivo.setMnemonic('a');
		jmCadastro.setMnemonic('c');
		jmAprovacao.setMnemonic('p');
		jmSelecao.setMnemonic('s');
		jmAdmin.setMnemonic('m');

		// coloca menu na janela principal
		setJMenuBar(jmPrincipal);

		// add actionListeners ao item jmItemVagas
		jmItemVagas.addActionListener(this);
		jmItemFornecedor.addActionListener(this);
		jmItemFechar.addActionListener(this);
		jmItemSelecao.addActionListener(this);
		jmItemAreaAtuacao.addActionListener(this);
		jmItemDadosEmpresa.addActionListener(this);
		jmItemUniversidade.addActionListener(this);

		// Windows Listener fechar tela

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Menu.this.windowClosed();
			}
		});

		// setar tamanho da tela
		setSize(800, 600);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent evt) {

		if (evt.getSource() == jmItemVagas) {

			if (telaVagas == null)
				telaVagas = Tela.getInstance("Cadastro de Vagas", this);
			else {
				if (telaVagas.isClosed())
					telaVagas = Tela.getInstance("Cadastro de Vagas", this);
			}
			jdPane.moveToFront(telaVagas);
		}

		if (evt.getSource() == jmItemFornecedor) {

			if (telaAprovacao == null) {
				telaAprovacao = Tela.getInstance("Aprova��o de Projetos", this);
			} else {
				if (telaAprovacao.isClosed())
					telaAprovacao = Tela.getInstance("Aprova��o de Projetos",
							this);
			}

			jdPane.moveToFront(telaAprovacao);

		}

		if (evt.getSource() == jmItemSelecao) {

			if (telaSelecao == null) {
				telaSelecao = Tela.getInstance("Sele��o de Curriculos", this);
			} else {
				if (telaSelecao.isClosed())
					telaSelecao = Tela.getInstance("Sele��o de Curriculos",
							this);
			}

			jdPane.moveToFront(telaSelecao);

		}
		if (evt.getSource() == jmItemAreaAtuacao) {

			if (telaAreaAtuacao == null) {
				telaAreaAtuacao = Tela.getInstance("Dados Area de Atua��o",
						this);
			} else {
				if (telaAreaAtuacao.isClosed())
					telaAreaAtuacao = Tela.getInstance("Dados Area de Atua��o",
							this);
			}

			jdPane.moveToFront(telaAreaAtuacao);

		}
		if (evt.getSource() == jmItemUniversidade) {

			if (telaUniversidades == null) {
				telaUniversidades = Tela.getInstance("Universidades", this);
			} else {
				if (telaUniversidades.isClosed())
					telaUniversidades = Tela.getInstance("Universidades", this);
			}
			jdPane.moveToFront(telaUniversidades);

		}

		if (evt.getSource() == jmItemDadosEmpresa) {
			if (telaDadosEmpresa == null) {
				telaDadosEmpresa = Tela.getInstance("Dados Empresa", this);
			} else {
				if (telaDadosEmpresa.isClosed())
					telaDadosEmpresa = Tela.getInstance("Dados Empresa", this);
			}

			jdPane.moveToFront(telaDadosEmpresa);

		}

		// Fechar janela

		if (evt.getSource() == jmItemFechar) {
			this.windowClosed();
		}
	}

	protected void windowClosed() {
		int a = JOptionPane.NO_OPTION;
		a = JOptionPane.showConfirmDialog(this, "Deseja Sair Realmente?",
				"Sistema Gerenciador de Curriculos", JOptionPane.YES_NO_OPTION);
		if (a == JOptionPane.YES_OPTION)
			System.exit(0);

	}

	public static void main(String[] args) {

		new Menu();
	}

	public void geraJanela() {

	}
}

package windows;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.WindowConstants;

public class JanelaPrincipal {
	public static void apresentarMenu() {
		// define a janela
		JFrame janelaPrincipal = new JFrame("Administração F1");
		janelaPrincipal.setTitle("Seleção de categoria");
		janelaPrincipal.setResizable(false);
		janelaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		janelaPrincipal.setSize(400, 300);
		janelaPrincipal.setLocationRelativeTo(null);
		// cria o menu da janela principal
		JMenuBar menuBar = new JMenuBar();
		// adiciona a barra de menu ao frame
		janelaPrincipal.setJMenuBar(menuBar);
		// define e adiciona menu na barra de menu
		JMenu menuAtualizar = new JMenu("Atualizar");
		menuBar.add(menuAtualizar);
		JMenu menuConsultar = new JMenu("Consultar");
		menuBar.add(menuConsultar);
		// cria e adiciona os itens
		JMenuItem menuEquipe = new JMenuItem("Equipe");
		menuAtualizar.add(menuEquipe);
		JMenuItem menuPiloto = new JMenuItem("Piloto");
		menuAtualizar.add(menuPiloto);
		JMenuItem menuCorrida = new JMenuItem("Corrida");
		menuAtualizar.add(menuCorrida);
		// cria as janelas de atualização
		JMenuItem tabelaEquipes = new JMenuItem("Equipes");
		menuConsultar.add(tabelaEquipes);
		JMenuItem tabelaPilotos = new JMenuItem("Pilotos");
		menuConsultar.add(tabelaPilotos);
		JMenuItem tabelaCorridas = new JMenuItem("Corridas");
		menuConsultar.add(tabelaCorridas);
		JanelaPiloto janelaPiloto = new JanelaPiloto();
		JFrame piloto = janelaPiloto.criarJanelaPiloto();
		JanelaEquipe janelaEquipe = new JanelaEquipe();
		JFrame equipe = janelaEquipe.criarJanelaEquipe();
		JanelaCorrida janelaCorrida = new JanelaCorrida();
		JFrame corrida = janelaCorrida.criarJanelaCorrida();
		JanelaConsultaPilotos consultaPilotos = new JanelaConsultaPilotos();
		JFrame dadosPilotos = consultaPilotos.criarJanela();
		JanelaConsultaEquipes consultaEquipes = new JanelaConsultaEquipes();
		JFrame dadosEquipes = consultaEquipes.criarJanela();
		// adiciona ação para os itens de menu
		menuPiloto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				piloto.setVisible(true);
			}
		});
		menuEquipe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				equipe.setVisible(true);
			}
		});
		menuCorrida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				corrida.setVisible(true);
			}
		});
		tabelaPilotos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dadosPilotos.setVisible(true);
			}
		});
		
		tabelaEquipes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dadosEquipes.setVisible(true);
			}
		});
		
		janelaPrincipal.setVisible(true);
	}
}

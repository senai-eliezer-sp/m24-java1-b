package br.com.senaisp.bauru.eliezer.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteDesenhos {

	public static void main(String[] args) {
		//Criando a janela 
		JOptionPane janela = new JOptionPane();
		//Criando a janela com diálogo
		JDialog dlg = janela.createDialog("Desenhos");
		//Dimensionando a janela
		dlg.setSize(800, 600);
		//Criando nosso conteúdo (desenho)
		DesenhoSwing desenho = new DesenhoSwing();
		//Atribuindo o desenho á janela
		dlg.setContentPane(desenho);
		//Mostrando a janela
		dlg.setVisible(true);
		
		
	}

}

package Aula04;

import javax.swing.JOptionPane;

public class IOComGUI {

	public static void main(String[] args) {
		String nome;
		
		JOptionPane.showMessageDialog(null, "Bem-vindo ao sistema!");
		nome = JOptionPane.showInputDialog("Informe seu nome");
		JOptionPane.showConfirmDialog(null, nome+",tem certeza que você deseja sair do sistema");
		

	}

}

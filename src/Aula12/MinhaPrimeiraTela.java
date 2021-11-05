package Aula12;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MinhaPrimeiraTela extends JFrame{
	
	public static void main(String[] args) {
		MinhaPrimeiraTela tela = new MinhaPrimeiraTela();
		tela.criarTela();
	}

	private void criarTela() {
		Container painel = getContentPane();
		setLayout(null);
		
		JLabel lNome = new JLabel("Nome:");
		lNome.setBounds(5,40,45,20);
		JTextField tfNome = new JTextField();
		tfNome.setBounds(50, 40, 200, 20);
		JTextField tfEmail = new JTextField();
		tfEmail.setBounds(50, 60, 200, 20);
		
		painel.add(lNome);
		painel.add(tfNome);
		painel.add(tfEmail);
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}

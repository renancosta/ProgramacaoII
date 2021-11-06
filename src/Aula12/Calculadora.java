package Aula12;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame{ 
	
	public static void main(String[] args) { 
		Calculadora tela = new Calculadora(); 
		tela.criaTela(); 
	} 
	private void criaTela() { 
		Container janela = getContentPane(); 
		setLayout(null);
		
		JTextField tfNum1 = new JTextField(); 
		tfNum1.setBounds(100,40,100,20);
		
		JTextField tfNum2 = new JTextField(); 
		tfNum2.setBounds(100,60,100,20); 
		
		JButton btnNewButton = new JButton("+"); 			
		btnNewButton.setBounds(100, 80, 100, 20); 
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 			
				JOptionPane.showMessageDialog(null, Integer.parseInt(tfNum1.getText())+Integer.parseInt(tfNum2.getText())); 
			} 
		});
		
		janela.add(tfNum1);
		janela.add(tfNum2);
		janela.add(btnNewButton);
		
		setSize(300,200); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
	} 
} 


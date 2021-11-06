package Aula12;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora2 extends JFrame{ 
	
	public static void main(String[] args) { 
		Calculadora2 tela = new Calculadora2(); 
		tela.criaTela(); 
	} 
	private void criaTela() { 
		Container janela = getContentPane(); 
		setLayout(null);
		
		JLabel valor = new JLabel("");
		valor.setBounds(20,0,80,30);
		
		JButton btn0 = new JButton("0"); 			
		btn0.setBounds(60, 140, 40, 30);
		JButton btn1 = new JButton("1"); 			
		btn1.setBounds(20, 110, 40, 30);
		JButton btn2 = new JButton("2"); 			
		btn2.setBounds(60, 110, 40, 30);
		JButton btn3 = new JButton("3"); 			
		btn3.setBounds(100, 110, 40, 30);
		JButton btn4 = new JButton("4"); 			
		btn4.setBounds(20, 80, 40, 30);
		JButton btn5 = new JButton("5"); 			
		btn5.setBounds(60, 80, 40, 30);
		JButton btn6 = new JButton("6"); 			
		btn6.setBounds(100, 80, 40, 30);
		JButton btn7 = new JButton("7");	
		btn7.setBounds(20, 50, 40, 30);
		JButton btn8 = new JButton("8"); 			
		btn8.setBounds(60, 50, 40, 30);
		JButton btn9 = new JButton("9"); 			
		btn9.setBounds(100, 50, 40, 30);
		
		JButton btnNewButton = new JButton("+"); 			
		btnNewButton.setBounds(140, 80, 50, 30); 
		btnNewButton.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 			
				
			} 
		});
		
		btn0.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 			
				 valor.setText("0");
			} 
		});
		
		btn1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 			
				 valor.setText("1");
			} 
		});
		
		janela.add(btn0);
		janela.add(btn1);
		janela.add(btn2);
		janela.add(btn3);
		janela.add(btn4);
		janela.add(btn5);
		janela.add(btn6);
		janela.add(btn7);
		janela.add(btn8);
		janela.add(btn9);
		janela.add(btnNewButton);
		janela.add(valor);
		
		setSize(300,300); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
	} 
} 


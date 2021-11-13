package Aula12;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaCalculadora extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculadora frame = new TelaCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lValor = new JLabel("");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		
		btn7.setBounds(56, 57, 40, 21);
		contentPane.add(btn7);
		
		
		btn8.setBounds(94, 57, 40, 21);
		contentPane.add(btn8);
		
		
		btn9.setBounds(133, 57, 40, 21);
		contentPane.add(btn9);
		
		
		btn4.setBounds(56, 75, 40, 21);
		contentPane.add(btn4);
		
		
		btn5.setBounds(94, 75, 40, 21);
		contentPane.add(btn5);
		
		
		btn6.setBounds(133, 75, 40, 21);
		contentPane.add(btn6);
		
		JButton btn7_6 = new JButton("7");
		btn7_6.setBounds(56, 99, 40, 21);
		contentPane.add(btn7_6);
		
		JButton btn7_7 = new JButton("7");
		btn7_7.setBounds(94, 99, 40, 21);
		contentPane.add(btn7_7);
		
		JButton btn7_8 = new JButton("7");
		btn7_8.setBounds(133, 99, 40, 21);
		contentPane.add(btn7_8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lValor.setText("0");
			}
		});
		btn0.setBounds(94, 119, 40, 21);
		contentPane.add(btn0);
		
		JButton btn7_10 = new JButton("+");
		btn7_10.setBounds(170, 99, 40, 21);
		contentPane.add(btn7_10);
		
		
		lValor.setBounds(56, 29, 117, 13);
		contentPane.add(lValor);
	}
}

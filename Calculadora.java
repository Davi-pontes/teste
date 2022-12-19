package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}
	double valor1, valor2;
	String operador;
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 374, 332);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "0");
			}
		});
		btnNewButton.setBounds(10, 248, 129, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton(".");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ ".");
			}
		});
		btnNewButton_2.setBounds(149, 248, 64, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				operador = "soma";
			}
		});
		btnNewButton_1_1.setBounds(218, 248, 64, 37);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "1");
			}
		});
		btnNewButton_1.setBounds(10, 205, 64, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "2");
			}
		});
		btnNewButton_1_2.setBounds(79, 205, 64, 37);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_1 = new JButton("3");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "3");
			}
		});
		btnNewButton_2_1.setBounds(149, 205, 64, 37);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_1_1_1 = new JButton("-");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				operador = "subtracao";
			}
		});
		btnNewButton_1_1_1.setBounds(218, 205, 64, 37);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_3_1 = new JButton("4");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "4");
			}
		});
		btnNewButton_3_1.setBounds(10, 161, 64, 37);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("5");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "5");
			}
		});
		btnNewButton_1_2_1.setBounds(79, 161, 64, 37);
		frame.getContentPane().add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("6");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "6");
			}
		});
		btnNewButton_2_1_1.setBounds(149, 161, 64, 37);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("*");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				operador = "multiplicacao";
			}
		});
		btnNewButton_1_1_1_1.setBounds(218, 161, 64, 37);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_3_1_1 = new JButton("7");
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "7");
			}
		});
		btnNewButton_3_1_1.setBounds(10, 117, 64, 37);
		frame.getContentPane().add(btnNewButton_3_1_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("8");
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "8");
			}
		});
		btnNewButton_1_2_1_1.setBounds(79, 117, 64, 37);
		frame.getContentPane().add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("9");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+ "9");
			}
		});
		btnNewButton_2_1_1_1.setBounds(149, 117, 64, 37);
		frame.getContentPane().add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("/");
		btnNewButton_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				operador = "divisao";
			}
		});
		btnNewButton_1_1_1_1_1.setBounds(218, 117, 64, 37);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1_1 = new JButton("CE");
		btnNewButton_1_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
			}
		});
		btnNewButton_1_1_1_1_1_1.setBounds(288, 117, 64, 37);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_2 = new JButton("C");
		btnNewButton_1_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = 0;
				valor2 = 0;
				txtResultado.setText("");
			}
		});
		btnNewButton_1_1_1_1_2.setBounds(288, 161, 64, 37);
		frame.getContentPane().add(btnNewButton_1_1_1_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("=");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtResultado.getText());
				if (operador == "soma") {
					
					txtResultado.setText(String.valueOf(valor1+valor2));
					
				}
				if (operador == "subtracao") {
					
					txtResultado.setText(String.valueOf(valor1-valor2));
					
				}
				if (operador == "multiplicacao") {
					
					txtResultado.setText(String.valueOf(valor1 * valor2));
					
				}
				if (operador == "divisao") {
					
					txtResultado.setText(String.valueOf(valor1 / valor2));
					
						
					
				}
				
			}
		});
		btnNewButton_1_1_2.setBounds(288, 205, 64, 80);
		frame.getContentPane().add(btnNewButton_1_1_2);
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtResultado.setBounds(10, 11, 338, 80);
		frame.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
	}
}

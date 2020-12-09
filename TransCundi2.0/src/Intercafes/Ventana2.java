package Intercafes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 frame = new Ventana2();
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
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(291, 392, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Punto de Llegada:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(64, 297, 177, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Punto de Inicio:");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel_1.setBounds(64, 221, 163, 24);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel = new JLabel("Busqueda de Rutas");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setBounds(94, 68, 444, 83);
		contentPane.add(lblNewLabel);
		
		
		txtPuntoDeInicio = new JTextField();
		txtPuntoDeInicio.setForeground(Color.GRAY);
		txtPuntoDeInicio.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeInicio.setText("");
		txtPuntoDeInicio.setBounds(268, 288, 126, 45);
		contentPane.add(txtPuntoDeInicio);
		txtPuntoDeInicio.setColumns(10);
		
		txtPuntoDeInicio = new JTextField();
		txtPuntoDeInicio.setForeground(Color.GRAY);
		txtPuntoDeInicio.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeInicio.setText("");
		txtPuntoDeInicio.setBounds(268, 213, 126, 45);
		contentPane.add(txtPuntoDeInicio);
		txtPuntoDeInicio.setColumns(10);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Sebastian\\git\\TransCundi\\TransCundi2.0\\Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
		


	}	
}

package Intercafes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ventana4 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
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
	public Ventana4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Crear rutas aleatorias ");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton_1.setBounds(237, 221, 152, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Crear rutas");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(237, 309, 152, 48);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("Seleccione una opci\u00F3n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(157, 97, 318, 83);
		contentPane.add(lblNewLabel);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Sebastian\\git\\TransCundi\\TransCundi2.0\\Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
		
	}

}


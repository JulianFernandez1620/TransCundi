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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;
	Ventana2 ventU = new Ventana2();
	Ventana3 ventC = new Ventana3();
	Ventana4 ventE = new Ventana4();
	//Interfaz inter = new Interfaz();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEmpresa = new JButton("EMPRESA");
		btnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventE.setLocationRelativeTo(null);
				ventE.setVisible(true);
				//dispose();
			}
		});
		btnEmpresa.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnEmpresa.setBounds(240, 342, 153, 43);
		contentPane.add(btnEmpresa);
		
		JButton btnConductor = new JButton("CONDUCTOR");
		btnConductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventC.setLocationRelativeTo(null);
				ventC.setVisible(true);
				//dispose();
			}
		});
		btnConductor.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnConductor.setBounds(240, 261, 153, 43);
		contentPane.add(btnConductor);
		
		JButton btnUsuario = new JButton("USUARIO");
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventU.setLocationRelativeTo(null);
				ventU.setVisible(true);
				//dispose();
			}
		});
		btnUsuario.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnUsuario.setBounds(240, 183, 153, 43);
		contentPane.add(btnUsuario);
		
		JButton btnNewButton_1 = new JButton("<-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_1.setBounds(23, 33, 52, 27);
		contentPane.add(btnNewButton_1);
		
		
		JLabel lblNewLabel = new JLabel("Elija una opci\u00F3n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(200, 68, 232, 83);
		contentPane.add(lblNewLabel);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
		


	}	
}

package Intercafes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Archivostxt.archivo;
import Rutas.Conductor;
public class Ventana3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;
	Ventana3_1 ventaA = new Ventana3_1();
	Ventana3_2 ventaB = new Ventana3_2();
	
	//VentanaInicial ventana = new VentanaInicial();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Nuevo Conductor ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventaA.setLocationRelativeTo(null);
				ventaA.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton_1.setBounds(237, 221, 152, 48);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("<-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_3.setBounds(23, 33, 52, 27);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("Conductor Registrado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventaB.setLocationRelativeTo(null);
				ventaB.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(237, 309, 152, 48);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("Seleccione una opci\u00F3n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(157, 97, 318, 83);
		contentPane.add(lblNewLabel);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
		
	}

}

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicial frame = new VentanaInicial();
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
	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEmpresa = new JButton("EMPRESA");
		btnEmpresa.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnEmpresa.setBounds(240, 342, 153, 43);
		contentPane.add(btnEmpresa);
		
		JButton btnConductor = new JButton("CONDUCTOR");
		btnConductor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConductor.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnConductor.setBounds(240, 261, 153, 43);
		contentPane.add(btnConductor);
		
		JButton btnNewButton = new JButton("USUARIO");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton.setBounds(240, 183, 153, 43);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("Elija una opci\u00F3n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel.setBounds(200, 68, 232, 83);
		contentPane.add(lblNewLabel);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("C:\\Users\\Sebastian\\git\\TransCundi\\TransCundi2.0\\Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
		


	}	
}

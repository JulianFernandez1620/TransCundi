package Intercafes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Archivostxt.archivo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Rutas.*;

public class Ventana4_2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;
	private JTextField txtPuntoDeLlegada;
	//Ventana4 ventana = new Ventana4();

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Ventana4_2() {
		archivo tex =new archivo();
		String[] municipios = tex.leerArchivo("MunicipiosCundinamarca.txt").split(",");
		Troncales troncales = new Troncales(municipios);
		troncales.insertarMatriz();
		Empresa empresa = new Empresa(troncales.getmatriz());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ruta = empresa.crearRuta(txtPuntoDeInicio.getText(), txtPuntoDeLlegada.getText()); 
				JOptionPane.showMessageDialog(null, "Ruta Creada\nPosibles Rutas:\n"+ruta);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(260, 395, 113, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Punto de llegada");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(80, 297, 177, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Punto de inicio");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel_1.setBounds(80, 221, 163, 24);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel = new JLabel("Ingrese la informaci\u00F3n");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		lblNewLabel.setBounds(133, 67, 367, 83);
		contentPane.add(lblNewLabel);
		
		txtPuntoDeLlegada = new JTextField();
		txtPuntoDeLlegada.setForeground(Color.GRAY);
		txtPuntoDeLlegada.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeLlegada.setText("");
		txtPuntoDeLlegada.setBounds(268, 288, 126, 45);
		contentPane.add(txtPuntoDeLlegada);
		txtPuntoDeLlegada.setColumns(10);
		
		txtPuntoDeInicio = new JTextField();
		txtPuntoDeInicio.setForeground(Color.GRAY);
		txtPuntoDeInicio.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeInicio.setText("");
		txtPuntoDeInicio.setBounds(268, 213, 126, 45);
		contentPane.add(txtPuntoDeInicio);
		txtPuntoDeInicio.setColumns(10);
		
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
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
	}

}
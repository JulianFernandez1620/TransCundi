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
import Rutas.Empresa;
import Rutas.Troncales;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;
	//Ventana4 ventana = new Ventana4();

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Ventana4_1() {
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
		
		JButton btnNewButton = new JButton("Crear Rutas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				empresa.crearRutasAleatorias(Integer.parseInt(txtPuntoDeInicio.getText()));
				JOptionPane.showMessageDialog(null,"Las Rutas fueron creadas\nSe encuentran en la base de datos.");
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(260, 368, 113, 23);
		contentPane.add(btnNewButton);
		
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
		
		JLabel lblNewLabel = new JLabel("Ingrese el n\u00FAmero de rutas que desea crear");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 28));
		lblNewLabel.setBounds(32, 64, 569, 189);
		contentPane.add(lblNewLabel);
		
		txtPuntoDeInicio = new JTextField();
		txtPuntoDeInicio.setForeground(Color.GRAY);
		txtPuntoDeInicio.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeInicio.setText("");
		txtPuntoDeInicio.setBounds(253, 257, 126, 45);
		contentPane.add(txtPuntoDeInicio);
		txtPuntoDeInicio.setColumns(10);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
	}

}


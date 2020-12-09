package Intercafes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Archivostxt.archivo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import Rutas.Troncales;
import Rutas.Usuario;
public class Ventana2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPuntoDeInicio;
	private JTextField txtPuntoDeLlegada;
	Usuario usuario;
	//VentanaInicial ventana = new VentanaInicial();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		archivo tex =new archivo();
		String[] municipios = tex.leerArchivo("MunicipiosCundinamarca.txt").split(",");
		Troncales troncales = new Troncales(municipios);
		troncales.insertarMatriz();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel lblNewLabel = new JLabel("Busqueda de Rutas");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 50));
		lblNewLabel.setBounds(94, 68, 444, 83);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Punto de Inicio:");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNewLabel_1.setBounds(64, 221, 163, 24);
		contentPane.add(lblNewLabel_1);
		
		txtPuntoDeInicio = new JTextField();
		txtPuntoDeInicio.setForeground(Color.GRAY);
		txtPuntoDeInicio.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeInicio.setText("");
		txtPuntoDeInicio.setBounds(268, 213, 126, 45);
		contentPane.add(txtPuntoDeInicio);
		txtPuntoDeInicio.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Punto de Llegada:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(64, 297, 177, 24);
		contentPane.add(lblNewLabel_1_1);
		
		txtPuntoDeLlegada = new JTextField();
		txtPuntoDeLlegada.setForeground(Color.GRAY);
		txtPuntoDeLlegada.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtPuntoDeLlegada.setText("");
		txtPuntoDeLlegada.setBounds(268, 288, 126, 45);
		contentPane.add(txtPuntoDeLlegada);
		txtPuntoDeLlegada.setColumns(10);
	
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				usuario = new Usuario(troncales.getmatriz());
				String ruta = usuario.crearRuta(txtPuntoDeInicio.getText(), txtPuntoDeLlegada.getText());
				JOptionPane.showMessageDialog(null, "Ruta Encontrada:\n"+ruta);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(291, 392, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
		


	}	
}

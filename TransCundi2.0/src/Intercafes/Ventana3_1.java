package Intercafes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Archivostxt.archivo;
import Rutas.Conductor;

public class Ventana3_1 extends JFrame {

	//private static final Container contentPane = null;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JPasswordField pss_contrasena;
	String [] Lconductores;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Ventana3_1() {
		archivo tex1 =new archivo();
		archivo ListaConductores= new archivo("ListaConductores.txt");
		Lconductores=tex1.leerArchivo("ListaConductores.txt").split(",");
		Conductor[] misConductores= new Conductor[1000];
		if (!Lconductores[0].equals("")) {
			int qu=0;
			for (int x=0;x<Lconductores.length;x++) {
				if(x%2==0) {
					qu=x/2;
						misConductores[qu]= new Conductor(Lconductores[x],Lconductores[x+1]);
				}
			}
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese sus datos");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
		lblNewLabel.setBounds(173, 67, 286, 83);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBackground(Color.WHITE);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Trebuchet MS", Font.BOLD, 21));
		lblNombre.setBounds(95, 221, 163, 24);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.GRAY);
		txtNombre.setFont(new Font("Trebuchet MS", Font.ITALIC, 15));
		txtNombre.setText("");
		txtNombre.setBounds(268, 213, 126, 45);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setForeground(Color.BLACK);
		lblContraseña.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblContraseña.setBackground(Color.WHITE);	
		lblContraseña.setBounds(95, 297, 177, 24);
		contentPane.add(lblContraseña);
		
		pss_contrasena = new JPasswordField();
		pss_contrasena.setBounds(268, 288, 126, 45);
		contentPane.add(pss_contrasena);
		
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
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombre=txtNombre.getText();
				String contrase =pss_contrasena.getText();
				int numA;
				if (Lconductores[0].equals(""))
					 numA=1;
				else {
					numA=0;
					for(int i=0;i<Lconductores.length;i++) {
						numA=((i+1)/2)+1;
					}
				}
				JOptionPane.showMessageDialog(null, " Bienvenido "+nombre+" Su ID es: "+ numA);
				ListaConductores.EscribirTexto(nombre+","+contrase+",");
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(260, 395, 113, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
	}

}

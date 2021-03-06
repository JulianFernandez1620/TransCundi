package Intercafes;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Interfaz extends JFrame {

	private JPanel contentPane;
	VentanaInicial ventana = new VentanaInicial();
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloPrincipal = new JLabel("Aqui va el titulo ome");
		lblTituloPrincipal.setIcon(new ImageIcon("Titulo.png"));
		lblTituloPrincipal.setBounds(118, 30, 401, 74);
		contentPane.add(lblTituloPrincipal);
		
		JLabel lblLogo = new JLabel("Aqui va el logo");
		lblLogo.setIcon(new ImageIcon("TRANSCUNDI_opt.png"));
		lblLogo.setBounds(181, 95, 262, 299);
		contentPane.add(lblLogo);
		
		JButton btnIngreso = new JButton("Ingresar");
		btnIngreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.setLocationRelativeTo(null);
				ventana.setVisible(true);
				//dispose();
			}
		});
		btnIngreso.setForeground(Color.DARK_GRAY);
		btnIngreso.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnIngreso.setBounds(118, 405, 180, 68);
		contentPane.add(btnIngreso);
		
		JButton btnSalida = new JButton("Salir");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalida.setForeground(Color.DARK_GRAY);
		btnSalida.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnSalida.setBounds(339, 405, 180, 68);
		contentPane.add(btnSalida);
		
		JLabel lbLFondo = new JLabel("New label");
		lbLFondo.setIcon(new ImageIcon("Fondo.jpg"));
		lbLFondo.setBounds(0, 0, 633, 489);
		contentPane.add(lbLFondo);
		
			
	}
}

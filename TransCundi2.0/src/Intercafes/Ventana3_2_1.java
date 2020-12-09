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

public class Ventana3_2_1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3_2_1 frame = new Ventana3_2_1();
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
	public Ventana3_2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("<-");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_2.setBounds(21, 28, 52, 27);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("NO/SALIR");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton_1.setBounds(271, 320, 113, 41);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFDesea ingresar un nuevo vehiculo?");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
		lblNewLabel_1.setBounds(65, 151, 517, 53);
		contentPane.add(lblNewLabel_1);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnNewButton.setBounds(271, 239, 113, 41);
		contentPane.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setBounds(55, 57, 553, 83);
		contentPane.add(lblNewLabel);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
	}
}

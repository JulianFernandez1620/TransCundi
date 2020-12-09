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
import javax.swing.SwingConstants;

public class Ventana3_2_1_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3_2_1_1 frame = new Ventana3_2_1_1();
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
	public Ventana3_2_1_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Siguiente");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setBounds(272, 392, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 282, 129, 53);
		contentPane.add(textField_1);
		
		textField = new JTextField();
		textField.setBounds(252, 138, 129, 53);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingrese el n\u00FAmero de asientos del vehiculo");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblNewLabel_1_1.setBounds(35, 218, 563, 53);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_2 = new JButton("<-");
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_2.setBounds(21, 28, 52, 27);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la placa del vehiculo");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 26));
		lblNewLabel_1.setBounds(143, 74, 346, 53);
		contentPane.add(lblNewLabel_1);
	
		
		JLabel lblFondo = new JLabel("New label");
		lblFondo.setBackground(Color.RED);
		lblFondo.setIcon(new ImageIcon("Ventana4.0.jpeg"));
		lblFondo.setBounds(0, 11, 633, 478);
		contentPane.add(lblFondo);
	}
}

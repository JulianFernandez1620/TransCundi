package Archivostxt;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
public class Pruebaxdxd{
		
	public static void main (String[] args) {
		File archivo;//manipular archivo
		FileWriter escribir;//Para escribir en el archivo
		PrintWriter linea;//Para escribir en el archivo
		String nombre="",dir="",email="";
		archivo= new File("usuario.txt");//Preparando el archivo
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
				nombre=JOptionPane.showInputDialog(null,"Ingresa el nombre:",
				"Solicitando datos",3);
				dir=JOptionPane.showInputDialog(null,"Ingresa usuario:",
				"Solicitando datos",3);
				email=JOptionPane.showInputDialog(null,"Ingresa  email:",
				"Solicitando datos",3);
				
				escribir = new FileWriter(archivo,true);//true-> para escribir al final, una sola linea de texto
				linea= new PrintWriter(escribir);//varias lineas de texto
				//Escribimos en el archivo
				linea.println(nombre);
				linea.println(dir);
				linea.println(email);
				linea.close();
				escribir.close();
				
				
			}catch(IOException ex) {
				Logger.getLogger(Pruebaxdxd.class.getName()).log(Level.SEVERE, null, ex);
			}

		}
		else {
			try {
				nombre=JOptionPane.showInputDialog(null,"Ingresa el nombre:",
				"Solicitando datos",3);
				dir=JOptionPane.showInputDialog(null,"Ingresa dirección:",
				"Solicitando datos",3);
				email=JOptionPane.showInputDialog(null,"Ingresa el email:",
				"Solicitando datos",3);
				
				escribir = new FileWriter(archivo,true);//true-> para escribir al final, una sola linea de texto
				linea= new PrintWriter(escribir);//varias lineas de texto
				//Escribimos en el archivo
				linea.println(nombre);
				linea.println(dir);
				linea.println(email);
				linea.close();
				escribir.close();
				
				
			}catch(IOException ex) {
				Logger.getLogger(Pruebaxdxd.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}


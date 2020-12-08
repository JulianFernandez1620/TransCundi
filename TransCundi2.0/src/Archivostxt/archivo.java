package Archivostxt;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivo {
	
	File archivos;//manipular archivo
	FileWriter escribir;//Para escribir en el archivo
	PrintWriter linea;//Para escribir en el archivo
	
	public archivo() {
		
	}
	
	public archivo(String Direccion) {
		this.archivos= new File(Direccion);
	}
	
	public String leerArchivo(String direccion) {
		String texto = "";
		try {
			BufferedReader bf = new BufferedReader(new FileReader(direccion));
			String temp = "";
			String bfRead;
			while((bfRead = bf.readLine()) != null) {
				temp = temp + bfRead;
			}
			texto = temp;
			bf.close();
		}catch(Exception e){System.err.println("No se encontro el archivo");}
		return texto;
	}
	public void EscribirTexto(String Entr) {
		
		
		if(!archivos.exists()) {

			try {
				archivos.createNewFile();
				escribir = new FileWriter(archivos,true);//true-> para escribir al final, una sola linea de texto
				linea= new PrintWriter(escribir);//varias lineas de texto
				//Escribimos en el archivo
				linea.println(Entr);

				linea.close();
				escribir.close();
			}
			catch(IOException ex) {
				Logger.getLogger(Pruebaxdxd.class.getName()).log(Level.SEVERE, null, ex);
			}

		}

		
		else {
			try {

				escribir = new FileWriter(archivos,true);//true-> para escribir al final, una sola linea de texto
				linea= new PrintWriter(escribir);//varias lineas de texto
				//Escribimos en el archivo
				linea.println(Entr);
				linea.close();
				escribir.close();
			}
			catch(IOException ex) {
				Logger.getLogger(Pruebaxdxd.class.getName()).log(Level.SEVERE, null, ex);


			}
		}	
	}
}

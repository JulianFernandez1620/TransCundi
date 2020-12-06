package Principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Rutas.*;



public class Main {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		Troncales troncal1 = new Troncales();
		String[] municipios = {"Bogota","Chia","Cajica","Zipaquira","Cogua","Tausa",
								"Carmen de Carupa","Simijaca"};
		troncal1.insertarMunicipios(municipios);
		troncal1.mostrarLista();
		
		
		String opcion=JOptionPane.showInputDialog(" Bienvenido, somos Transcundi � Ingrese 1 si es conductor, "
				+ "Ingrese 2 si es un usuario, Ingrese 3 si es Empresa.");
		

		Conductor[] misConductores= new Conductor[7]; 
		misConductores[0]=new Conductor("Paco G�mez","001","contra");
		misConductores[1]=new Conductor("Ana L�pez","002","contra");
		misConductores[2]=new Conductor("Mar�a Mart�n","003","contra");
		misConductores[3]=new Conductor("Anonio Fern�ndez","004","contra");
		misConductores[5]=new Conductor("Mar�a Hern�ndez","005","contra");
		misConductores[6]=new Conductor("Mario Rodriguez","006","contra");
		
		if(opcion.equals("1")){
			String usuario=JOptionPane.showInputDialog("Ingrese su Usuario");
			String contrase=JOptionPane.showInputDialog("Ingrese su contrase�a");
			int i=0;
			
			while(!misConductores[i].ConfContra(usuario, contrase)&&i<7) {
				i++;
			}
			if(i>=7)
				System.out.println("Contrase�a o Usuarios incorrectos");
			else {
				String vehi=JOptionPane.showInputDialog("�Desea ingresar un nuevo vehiculo? (si/no)");
					if(vehi.equalsIgnoreCase("si")) {
						String placa = JOptionPane.showInputDialog("Ingrese placa del vehiculo");
						String asientos = JOptionPane.showInputDialog("Ingrese el n�mero de asientos");
						String empresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa del vehiculo");
						int ASIENTOS= Integer.parseInt(asientos);
						Vehiculo vehiculo = new Vehiculo(ASIENTOS, placa, empresa);
						System.out.println("Ingrese 1 si hay pasajeros que bajan, ingrese 2 si hay pasajeros que suben, ingrese 3 para salir");
					    while(in.hasNext()){
				            String s = in.next();
				            int num= Integer.parseInt(s);
				            if (num==1) {
				            	String pas=JOptionPane.showInputDialog("�Cu�ntos pasajeros se bajar�n?");
				            	vehiculo.Bajar(Integer.parseInt(pas));				            	
				            }
				            else if (num==2) {
				            	String pas1=JOptionPane.showInputDialog("�Cu�ntos pasajeros se subir�n?");
				            	vehiculo.Subir(Integer.parseInt(pas1));				            	
				            }
				            else {
				            	
				            System.out.println("Tenga un buen d�a");
				            }
				        }	
					}														
				}		
		}
		else if(opcion.equals("2"))
			System.out.println("Bienvenido Usuario");
//COMPRAR/MIRAR EMPRESAS/MIRAR PRECIOS INGRESAR RUTAS		
		
		
		//EMPRESA: CREAR RUTAS 
		else
			System.out.println("Opci�n incorrecta");
		in.close();
		
	}
}

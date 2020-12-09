package Principal;
import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Rutas.*;
import Archivostxt.*;
import javax.swing.*;
import Intercafes.*;


public class Main {
	public static void main(String args[]) {
		Interfaz window = new Interfaz();
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		Scanner in = new Scanner(System.in);
		archivo tex =new archivo();
		archivo tex1 =new archivo();
		archivo ListaConductores= new archivo("ListaConductores.txt");
		String[] municipios = tex.leerArchivo("MunicipiosCundinamarca.txt").split(",");
		String [] Lconductores;
		Lconductores=tex1.leerArchivo("ListaConductores.txt").split(",");
		Troncales troncales = new Troncales(municipios);
		troncales.insertarMatriz();
		//troncales.mostrarMatriz();
		
		/*
		String opcion=JOptionPane.showInputDialog(" Bienvenido, somos Transcundi ® Ingrese 1 si es conductor, "
				+ "Ingrese 2 si es un usuario, Ingrese 3 si es Empresa.");
		
		
		Conductor[] misConductores= new Conductor[1000];
		if(opcion.equals("1")){
			
			if (!Lconductores[0].equals("")) {
				int qu=0;
			for (int x=0;x<Lconductores.length;x++) {
				if(x%2==0) {
					qu=x/2;
					misConductores[qu]= new Conductor(Lconductores[x],Lconductores[x+1]);
			}
		 }
		}
			
			
			String opcion2=JOptionPane.showInputDialog("Si usted es usuario nuevo ingrese 1,"
					+ "de lo contrario ingrese 2");
			
			if(opcion2.equals("1")){
				
				String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
				String contrase =JOptionPane.showInputDialog("Ingrese su contraseña");
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
				else {
							
				String usuario=JOptionPane.showInputDialog("Ingrese su ID");
				int ID= Integer.parseInt(usuario);
				String contrase=JOptionPane.showInputDialog("Ingrese su contraseña");
				int i=0;
				
				while(!misConductores[i].ConfContra(ID, contrase)&&i<1000) {
					i++;
				}
				if(i>=1000)
					System.out.println("Contraseña o Usuarios incorrectos");
				else {
					String vehi=JOptionPane.showInputDialog("¿Desea ingresar un nuevo vehiculo? (si/no)");
						if(vehi.equalsIgnoreCase("si")) {
							String placa = JOptionPane.showInputDialog("Ingrese placa del vehiculo");
							String asientos = JOptionPane.showInputDialog("Ingrese el número de asientos");
							String empresa = JOptionPane.showInputDialog("Ingrese el nombre de la empresa del vehiculo");
							int ASIENTOS= Integer.parseInt(asientos);
							Vehiculo vehiculo = new Vehiculo(ASIENTOS, placa, empresa);
							System.out.println("Ingrese 1 si hay pasajeros que bajan, ingrese 2 si hay pasajeros que suben, ingrese 3 para salir");
						    while(in.hasNext()){
					            String s = in.next();
					            int num= Integer.parseInt(s);
					            if (num==1) {
					            	String pas=JOptionPane.showInputDialog("¿Cuántos pasajeros se bajarán?");
					            	vehiculo.Bajar(Integer.parseInt(pas));				            	
					            }
					            else if (num==2) {
					            	String pas1=JOptionPane.showInputDialog("¿Cuántos pasajeros se subirán?");
					            	vehiculo.Subir(Integer.parseInt(pas1));				            	
					            }
					            else {
					            	
					            System.out.println("Tenga un buen día");
					            }
					        }	
						}														
					}		
				}
			}
		else if(opcion.equals("2"))
			System.out.println("Bienvenido Usuario");		
		else if(opcion.equals("3")) {
			
			String decision =JOptionPane.showInputDialog("1. Generar rutas aleatorias \n 2.Crear Ruta");
			if(decision.equals("1")) {
				int cantidad =Integer.parseInt(JOptionPane.showInputDialog("Cuantos queres flaco... : "));
				Ruta ruticas[] = new Ruta[cantidad];
				for(int i = 0; i<cantidad; i++) {
					ruticas[i] = new Ruta(troncales.getmatriz());
				}
				String rutas = "";
				for(int i = 0; i<cantidad; i++) {
					ruticas[i].insertarM();
					rutas = rutas + "\n" + ruticas[i].mostrarRutas();
				}
				rutasA.EscribirTexto(rutas);
				JOptionPane.showMessageDialog(null,"Pana ya fueron agregadas a la base de datos");	
				
			}else if(decision.equals("2")) {
				String inicio =JOptionPane.showInputDialog("Punto de inicio: ");
				String llegada =JOptionPane.showInputDialog("Punto de llegada: ");
				Ruta rutica = new Ruta(troncales.getmatriz());
				String[] rutaCreada = new String[5];
				rutica.insertarEspecificamente(inicio, llegada);
				rutaCreada = rutica.mostrarRutasEspecificas();
				String rutaF = "";
				for(int i = 0; i < rutaCreada.length; i++) {
					rutaF = rutaF + "\n" +rutaCreada[i];
				}
				rutasE.EscribirTexto(rutaF);
				JOptionPane.showMessageDialog(null,"Posibles Rutas\n"+rutaF,
						"TransCundi",1);
				
			
			
				
			
		}
			
		in.close();
		
		*/
		
	}
}

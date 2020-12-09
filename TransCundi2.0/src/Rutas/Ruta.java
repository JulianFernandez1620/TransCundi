package Rutas;
import java.util.Random;

import javax.swing.JOptionPane;

import EstructurasDatos.*;
public class Ruta {
	ListaDoblementeEnlazada rutas;
	ListaDoblementeEnlazada temp[];
	ListaDoblementeEnlazada temp2;
	//Random random;
	//Random random2;
	//Random random3;
	String[][] troncal;
	public int fila;
	public int inicio;
	public int llegada;
	public Ruta(String[][] troncal) {
		//this.random = new Random();
		//this.random2 = new Random();
		//this.random3 = new Random();
		temp = new ListaDoblementeEnlazada[5];
		this.rutas = new ListaDoblementeEnlazada();
		this.troncal = troncal;
		this.fila = (int) (Math.random()*16);
		this.inicio = (int) (Math.random()*4);
		this.llegada = (int) (Math.random()*20+5);
		//while(troncal[fila][llegada] == null) 
			//this.fila = random.nextInt(16);
	}
	public void insertarM() {
		//for(int i = 0; i<= 100; i++) {
			//for(int a = 0; a <= 12; a++) {
				for(int j = inicio; j <= llegada; j++) {
					if(troncal[fila][j]!=null)
					rutas.insertarInicio(troncal[fila][j]);
				}
			//}
		//}
	}
	public void insertarEspecificamente(String inicio, String llegada) {
		int pos = 0;
		for(int i = 0; i<troncal.length; i++) {
			for(int j = 0; j<troncal[i].length;j++) {
				if(troncal[i][j]!= null) {
					if(troncal[i][j].equals(inicio)) {
						//System.out.println("Inicio encontrado");
							for(int a = j; a<troncal[i].length;a++) {
								if(troncal[i][a]!= null) {
									if(troncal[i][a].equals(llegada)) {
										temp[pos] = new ListaDoblementeEnlazada();
										for(int b = j; b<=a;b++) {
											
											temp[pos].insertarInicio(troncal[i][b]);
											//System.out.print("->"+temp[pos].tail.dato);
										}
										//System.out.println();  
										pos++;
										//break;
									}
								}
							}
						//break;
					}
				}
			}
		}
	}
	public void busqueda(String inicio, String llegada) {
		int pos = 0;
		while(pos == 0) {
		for(int i = 0; i<troncal.length; i++) {
			for(int j = 0; j<troncal[i].length;j++) {
				if(troncal[i][j]!= null) {
					if(troncal[i][j].equals(inicio)) {
						//System.out.println("Inicio encontrado");
							for(int a = j; a<troncal[i].length;a++) {
								if(troncal[i][a]!= null) {
									if(troncal[i][a].equals(llegada)) {
										temp2 = new ListaDoblementeEnlazada();
										for(int b = j; b<=a;b++) {
											
											temp2.insertarInicio(troncal[i][b]);
											//System.out.print("->"+temp[pos].tail.dato);
										}
										//System.out.println();  
										pos++;
										//break;
									}
								}
							}
						//break;
					}
				}
			}
		}
		}
	}
	
	
	public String[] mostrarRutasEspecificas() {
		//for(int i = 0; i<= 100; i++) {
		String[] h = new String[temp.length];
		for(int i=0; i<temp.length;i++) {
			h[i] = "";
		}
		for(int i = 0; i < temp.length; i++) {
			if(temp[i]!=null) {
				while(!temp[i].isEmpty()) {
						h[i] = h[i]+"->"+temp[i].elimiarFinal();
						//System.out.println(h[i]);
				}
			}
			
		}
		
			return h;
	}

	public String mostrarRutas() {
		//for(int i = 0; i<= 100; i++) {
		String h = "";
			while(!temp2.isEmpty()) {
				h = h +"->"+temp2.elimiarFinal();
			}
			return h;
		}
	//}
	
}

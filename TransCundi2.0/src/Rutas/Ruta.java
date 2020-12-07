package Rutas;
import java.util.Random;

import EstructurasDatos.*;
public class Ruta {
	ListaDoblementeEnlazada rutas;
	//Random random;
	//Random random2;
	//Random random3;
	String[][] troncal;
	//public int fila;
	//public int inicio;
	//public int llegada;
	public Ruta(String[][] troncal) {
		//this.random = new Random();
		//this.random2 = new Random();
		//this.random3 = new Random();
		this.rutas = new ListaDoblementeEnlazada();
		this.troncal = troncal;
		//this.fila = random.nextInt(16);
		//this.inicio = random2.nextInt(4);
		//this.llegada = 5+random3.nextInt(4);
		//while(troncal[fila][llegada] == null) 
			//this.fila = random.nextInt(16);
	}
	public void insertarM() {
		//for(int i = 0; i<= 100; i++) {
			for(int a = 0; a <= 12; a++) {
				for(int j = 5; j <= 9; j++) {
					rutas.insertarInicio(troncal[a][j]);
				}
			}
		//}
	}
	public void mostrarRutas() {
		//for(int i = 0; i<= 100; i++) {
			while(!rutas.isEmpty()) {
				System.out.print(rutas.elimiarInicio()+" -> ");
			}
		}
	//}
	
}

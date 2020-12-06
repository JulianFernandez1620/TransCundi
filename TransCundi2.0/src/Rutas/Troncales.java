package Rutas;
import EstructurasDatos.*;
public class Troncales {
	public ListaDoblementeEnlazada lista;
	public Troncales() {
		this.lista = new ListaDoblementeEnlazada();
	}
	
	public void insertarMunicipios(String[] a) {
		for(int i = 0; i < a.length; i++) {
			lista.insertarFinal(a[i]);
		}
	}
	public void mostrarLista() {
		while(!lista.isEmpty()) {
			System.out.print(lista.elimiarInicio()+" -> ");
		}
	}
	public void nodoencontrado(String a) {
		lista.buscar(a);	
	}
}

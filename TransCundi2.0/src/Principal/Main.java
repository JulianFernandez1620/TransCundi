package Principal;

import Rutas.Troncales;

public class Main {
	public static void main(String args[]) {
		Troncales troncal1 = new Troncales();
		String[] municipios = {"Bogota","Chia","Cajica","Zipaquira","Cogua","Tausa",
								"Carmen de Carupa","Simijaca"};
		troncal1.insertarMunicipios(municipios);
		troncal1.mostrarLista();
		
	}
}

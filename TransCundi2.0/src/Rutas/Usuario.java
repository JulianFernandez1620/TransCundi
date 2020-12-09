package Rutas;

import Archivostxt.archivo;

public class Usuario  {
	String[][] troncal;
	public Usuario(String[][] troncal) {
		this.troncal = troncal;
	}
	public String crearRuta(String inicio, String llegada) {
		Ruta rutica = new Ruta(troncal);
		String rutaCreada;
		rutica.busqueda(inicio, llegada);
		rutaCreada = rutica.mostrarRutas();
		return rutaCreada;
	}
}

package Rutas;
import Archivostxt.archivo;

public class Empresa {
	String[][] troncal;
	archivo rutasA;
	archivo rutasE;
	String rutaF;
	public Empresa(String[][] troncal) {
		this.troncal = troncal;
		this.rutasA= new archivo("RutasAleatorias.txt");
		this.rutasE= new archivo("RutasEspecificas.txt");
		this.rutaF = "";
	}
	public void crearRutasAleatorias(int cantidad) {
		Ruta ruticas[] = new Ruta[cantidad];
		for(int i = 0; i<cantidad; i++) {
			ruticas[i] = new Ruta(troncal);
		}
		String rutas = "";
		for(int i = 0; i<cantidad; i++) {
			ruticas[i].insertarM();
			rutas = rutas + "\n" + ruticas[i].mostrarRutas();
		}
		rutasA.EscribirTexto(rutas);
	}
	
	public String crearRuta(String inicio, String llegada) {
		Ruta rutica = new Ruta(troncal);
		String[] rutaCreada = new String[5];
		rutica.insertarEspecificamente(inicio, llegada);
		rutaCreada = rutica.mostrarRutasEspecificas();
		String rut = "";
		for(int i = 0; i < rutaCreada.length; i++) {
			rut = rut + "\n" +rutaCreada[i];
		}
		rutasE.EscribirTexto(rut);
		return rut;
	}
	
	public String getRuta() {
		return rutaF;
	}
}

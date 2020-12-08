package Rutas;

public class Empresa {
	String[][] troncal;
	Ruta rutica;
	public Empresa(String[][] troncal) {
		this.troncal = troncal;
		rutica = new Ruta(troncal);
	}
	
	public void crearRuta(String inicio, String llegada) {
		
	}
}

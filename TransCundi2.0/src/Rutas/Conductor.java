package Rutas;

public class Conductor{
	private String NombreConductor;
	private String ClaveUsua;
	private int Id;
	private static int IdSiguiente=1;

	
	
	public Conductor(String nombrec, String contras) {
		this.ClaveUsua=contras;
		this.NombreConductor=nombrec;
		 Id=IdSiguiente;
		 IdSiguiente++;	
	}
	
	public boolean ConfContra(int usua, String Contra) {	
		boolean Confirm=false;
		
		if (ClaveUsua.equals(Contra)&&Id==usua) {
			Confirm=true;
			System.out.println("Bienvenido "+NombreConductor);
		}
		else
			Confirm=false;
		return Confirm;
	}	
	
public String dameID() {
		 
		 return "Su ID es: "+ Id;
	 }

	
}

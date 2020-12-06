package Rutas;

public class Conductor{
	private String NombreConductor;
	private String NombredUsuario;
	private String ClaveUsua;
	
	public Conductor(String nombrec,String usuarioCond, String contras) {
		this.ClaveUsua=contras;
		this.NombreConductor=nombrec;
		this.NombredUsuario=usuarioCond;
	}
	
	public boolean ConfContra(String usua, String Contra) {	
		boolean Confirm=false;
		
		if (ClaveUsua.equals(Contra)&&NombredUsuario.equalsIgnoreCase(usua)) {
			Confirm=true;
			System.out.println("Bienvenido "+NombreConductor);
		}
		else
			Confirm=false;
		return Confirm;
	}	
}

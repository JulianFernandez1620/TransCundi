package EstructurasDatos;

public class Nodo {
	public String dato;
	public Nodo back;
	public Nodo next;

	public Nodo(String dato, Nodo back, Nodo next) {
		this.dato = dato;
		this.back = back;
		this.next = next;
	}
	public Nodo(String dato) {
		this(dato,null,null);
	}
	
}

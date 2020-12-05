package EstructurasDatos;

public class Nodo {
	public int dato;
	public Nodo back;
	public Nodo next;

	public Nodo(int dato, Nodo back, Nodo next) {
		this.dato = dato;
		this.back = back;
		this.next = next;
	}
	public Nodo(int dato) {
		this(dato,null,null);
	}
	
}

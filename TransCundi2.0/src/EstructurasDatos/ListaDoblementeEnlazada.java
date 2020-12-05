package EstructurasDatos;

public class ListaDoblementeEnlazada {
	private Nodo head;
	private Nodo tail;
	public ListaDoblementeEnlazada() {
		this.head = null;
		this.tail = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void insertarFinal(int dato) {
		if(isEmpty())
			head = tail = new Nodo(dato);
		else {
			tail = new Nodo(dato,tail,null);
			tail.back.next = tail;
		}
			
	}
	public void insertarInicio(int dato) {
		if(isEmpty())
			head = tail = new Nodo(dato);
		else {
			head = new Nodo(dato,null,head);
			head.next.back = head;
		}
			
	}
	public int elimiarInicio() {
		int elemento = head.dato;
		if(head == tail) {
			head = tail = null;
		}else {
			head = head.next;
			head.back = null;
		}
		return elemento;
	}
	public int elimiarFinal() {
		int elemento = tail.dato; 
		if(head == tail) {
			head = tail = null;
		}else {
			tail = tail.back;
			tail.next = null;
		}
		return elemento;
	}
}

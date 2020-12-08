package EstructurasDatos;

public class ListaDoblementeEnlazada {
	public Nodo head;
	public Nodo tail;
	public ListaDoblementeEnlazada() {
		this.head = null;
		this.tail = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public void insertarFinal(String dato) {
		if(isEmpty())
			head = tail = new Nodo(dato);
		else {
			tail = new Nodo(dato,tail,null);
			tail.back.next = tail;
		}
			
	}
	public void insertarInicio(String dato) {
		if(isEmpty())
			head = tail = new Nodo(dato);
		else {
			head = new Nodo(dato,null,head);
			head.next.back = head;
		}
			
	}
	public String elimiarInicio() {
		String elemento = head.dato;
		if(head == tail) {
			head = tail = null;
		}else {
			head = head.next;
			head.back = null;
		}
		return elemento;
	}
	public String elimiarFinal() {
		String elemento = tail.dato; 
		if(head == tail) {
			head = tail = null;
		}else {
			tail = tail.back;
			tail.next = null;
		}
		return elemento;
	}
	public Nodo buscar(String a) {
		Nodo temp = head;
		while(temp != null) {
			if(temp.dato == a) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}
	
}

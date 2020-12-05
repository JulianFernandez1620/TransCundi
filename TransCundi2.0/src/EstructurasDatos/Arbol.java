package EstructurasDatos;

public class Arbol {
	NodoArbol raiz;
	public Arbol() {
		this.raiz = null;
	}
	
	public void insertarNodo(int x) {
		NodoArbol nuevo = new NodoArbol(x);
		if(raiz == null) {
			raiz = nuevo;
		}else {
			NodoArbol temp = raiz;
			NodoArbol padre;
			while(true) {
				padre = temp;
				if(x<temp.dato) {
					temp = temp.left;
					if(temp == null) {
						padre.left = nuevo;
						return;
					}
				}else {
					temp = temp.right;
					if(temp == null) {
						padre.right = nuevo;
						return;
					}
				}
			}
		}
	}
}

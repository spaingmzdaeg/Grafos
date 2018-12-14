
public class Nodo {
	//Atributos
		Object elemento;
		Nodo siguiente;
		int dato;
		
		//Constructores
		public Nodo(Object x){
			elemento = x;
			siguiente = null;
		}
		public Nodo(int x){
			dato = x;
		    siguiente = null;
		}
		public Nodo(int x, Nodo n){
		    dato = x;
		    siguiente = n;
		}
		
		//Getters and Setters
		public int getDato(){
		    return dato;
		}
		
		public Nodo getEnlace(){
		    return siguiente;
		}
		public void setEnlace(Nodo enlace){
		    this.siguiente = enlace;
	}
}

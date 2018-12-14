
public class PilaLista {
	//Atributos
		private NodoPila cima;
		
		//Constructor
		public PilaLista(){
			cima = null;
	    }
		
		//Metodos
		public boolean pilaVacia(){
			return cima == null;
		}
		
		public void insertar(Object elemento){
			NodoPila nuevo;
		    nuevo = new NodoPila(elemento);
		    nuevo.siguiente = cima;
		    cima = nuevo;
		}
		
		public Object quitar() throws Exception{
			if (pilaVacia())
				throw new Exception ("Pila vacia, no se puede extraer.");
			Object aux = cima.elemento;
			cima = cima.siguiente;
			return aux;
		}
		
		public Object cimaPila() throws Exception{
			if (pilaVacia())
				throw new Exception ("Pila vacia, no se puede leer cima.");
			return cima.elemento;
		}
		public void limpiarPila(){
			NodoPila t;
			while(!pilaVacia()){
				t = cima;
				cima = cima.siguiente;
				t.siguiente = null;
			}
	}
	
}

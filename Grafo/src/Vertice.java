
public class Vertice {
	//Atributos
		private String nombre;
		private int numVertice;
		
		//constructores
		public Vertice() {
		}
		public Vertice(String x){
			nombre = x;
			numVertice = -1;
	}
		
		//Getters and Setters
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public int getNumVertice() {
			return numVertice;
		}
		public void setNumVertice(int numVertice) {
			this.numVertice = numVertice;
		}
		
		//Metodos
		public String nomVertice(){ // devuelve identificador del v�rtice
			return nombre;
		}
		public boolean equals(Vertice n){ // true, si dos v�rtices son iguales
			return nombre.equals(n.nombre);
		}
		public void asigVert(int n){ // establece el n�mero de v�rtices
			numVertice = n;
		}
		public String toString(){ // caracter�sticas del v�rtice
			return nombre + " (" + numVertice + ")";
	}
}

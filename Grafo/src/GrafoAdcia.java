
public class GrafoAdcia {
	//Atributos
		int numVerts;
	    static int maxVerts = 20;
	    Vertice [] tablAdc;
	    
	    //Constructor
	    public GrafoAdcia(int mx){
	    	tablAdc = new Vertice[mx];
	        numVerts = 0;
	        maxVerts = mx;
	    }
	    
	    //Metodos
	    public int numVertice(String vs) {
	        Vertice v = new Vertice(vs);
	        boolean encontrado = false;
	        int i = 0;
	        for (; (i < numVerts) && !encontrado;){
	        	encontrado = tablAdc[i].equals(v);
	       	 	if (!encontrado) 
	       	 		i++ ;
	       	}
	        return (i < numVerts) ? i : -1 ;
	}
}

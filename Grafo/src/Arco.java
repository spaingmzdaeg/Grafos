
public class Arco {
	//Atributos
		int destino;
	    double peso;
	    
	    //Constructores
	    public Arco(int d){
	    	destino = d;
	    }
	    public Arco(int d, double p){
	    	this(d);
	    	peso = p;
	    }
	    
	    //Metodos
	    public int getDestino(){
	        return destino;
	    }
	   
	    public boolean equals(Object n){
	    	Arco a = (Arco)n;
	    	return destino == a.destino;
	}
}

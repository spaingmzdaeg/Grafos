/*
 * Luis Joyanes Aguilar, Ignacio Zahonero Martinez.(2008).
 * Grafos, representación y operaciones.
 
 */

import java.util.Scanner;

public class PruebaGrafos {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese la cantidad maxima de vertices a ingresar...");
		int maximoVertices=entrada.nextInt();
		System.out.println();
		System.out.println();
		
		GrafoMatriz grafo = new GrafoMatriz(maximoVertices);
	    int opcion=0;
	    boolean repetir=true;
	    
	    do{
			System.out.println("1  Agregar un vertice.");
			System.out.println("2  Agregar un arco.");
			System.out.println("3  Verificar adyacencia.");
			System.out.println("4  Recorrer grafo en anchura.");
			System.out.println("5  Salir.");
			System.out.println("------------------------------");
			System.out.println("Elija una opcion...");
		    opcion=entrada.nextByte();
		    System.out.println();
		    System.out.println();
		    
		    if(opcion>=1 && opcion<=5){
		    	entrada.nextLine();
		    	switch(opcion) {
			    case 1: 
			    	if(grafo.verificarinIcializacion()){
			    		if(!grafo.verificarGrafoLleno()){
			    			System.out.println("Ingrese el nombre del vertice...");
							String nombre=entrada.nextLine();
							grafo.nuevoVertice(nombre);
							System.out.println();
							System.out.println();
							System.out.println("   Vertice agregado correctamente.");
			    		}
			    		else
			    			System.out.println("   *Se ha alcanzado el maximo de vertices a ingresar");
			    	}
			    	else
			    		System.out.println("   *El grafo no ha sido inicializado");
					System.out.println();
					System.out.println();
					break;
			    case 2:
			    	System.out.println("Ingrese el nombre del vertice origen...");
					String verticeOrigen=entrada.nextLine();
					System.out.println("Ingrese el nombre del vertice destino...");
					String verticeDestino=entrada.nextLine();
					System.out.println();
					System.out.println();
					try {
						grafo.nuevoArco(verticeOrigen, verticeDestino);
						System.out.println("   Arco agregado correctamente.");
					}catch (Exception e) {
						System.out.println("   *Error al agregar el arco, ambos vertices deben ser validos.");
					}
					System.out.println();
					System.out.println();
					break;
			    case 3: 
			    	System.out.println("Ingrese el nombre del primer vertice...");
					String vertice1=entrada.nextLine();
					System.out.println("Ingrese el nombre del segundo vertice...");
					String vertice2=entrada.nextLine();
					System.out.println();
					System.out.println();
					try {
						if(grafo.adyacente(vertice1, vertice2))
							System.out.println("   Los vertices si son adyacentes.");
						else
							System.out.println("   Los vertices no son adyacentes.");
					} catch (Exception e) {
						System.out.println("   *Error al verificar adyacencia, ambos vertices deben ser validos.");
					}
					System.out.println();
					System.out.println();
					break;
			    case 4: 
			    	System.out.println("Ingrese el nombre del vertice a partir del cual se hara el recorrido...");
					String verticeInicio=entrada.nextLine();
					System.out.println();
					System.out.println();
					try {
						System.out.print("   ");
						grafo.recorrerAnchura(grafo, verticeInicio);
					} catch (Exception e) {
						System.out.println("   *Error al recorrer el grafo, ingrese un vertice valido.");
					}
					System.out.println();
					System.out.println();
					break;
			    case 5: 
			    	repetir=false;
			    	break;
		    	}
		    }
		    else{
		    	System.out.println("   *"+opcion+" no es una opcion valida, intenta otra vez.");
				System.out.println();
				System.out.println();
		    }
		    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println();
			System.out.println();
	    }
	    while(repetir);
	    System.out.println("Usted ha salido.");
}
}

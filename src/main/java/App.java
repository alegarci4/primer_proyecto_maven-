import java.util.Arrays;
import java.util.ArrayList;
public class App {

	
	public static void main(String[] args) {
		System.out.println("Hola mundo desde Java");
		
		int a = 6;
		int b = 7;
		int resultado = a * b; 
		
		System.out.println("Resultado:" + resultado);

		
	//¿Cómo se declara un arreglo en Java? indicamos el tipo de dato y despues el nombre del arreglo 
		
		//Forma 1 para declarar un arreglo: Con tamaño definido 
		  int [] numero = new int [4]; //aca cree un arreglo que guarda 4 numeros enteros pero le faltan sus valores
		  
		//Forma 2 para declarar un arreglo: Con sus valores desde un inicio 
		  int [] numeros = {1,2,3,4}; //aca el arreglo ya tiene valores desde el inicio 
		  
		  
    //Métodos y utilidades principales para arreglos (java.util.Arrays) para usar estas herrmientas importamos su debida libreria 
		  
		  
		//Arrays.sort () : sirve para ordenar un arreglo 
		  int [] numeros2 = {5, 2, 8, 1};
		  Arrays .sort(numeros2);
		  System.out.println(Arrays.toString(numeros2)); // como resultado nos dará numeros ordenados de manor a mayor 
		  
		//Arrays.binarySearch() : sirve para que busque un elemento dentro de un arreglo ya ordenado 
		  int [] numeros3 = Arrays.binarySearch(numeros3, 5);
		  System.out.println(posicion); //nos da la posicion donde estaba el numero 5 
		  
		//Arrays.copyof() : sirve para copiar un arreglo 
		  int [] numeros4 = {1, 2, 3};
		  int [] copia = Arrays.copyOf(numeros4, 3);
		  System.out.println(Arrays.toString(copia)); //crea un nuevo arreglo con los mismos valores 
		  
	    // Arrays.fill() : sirve para llenar todos los arreglos con el mismo valor
		  int [] numeros5 = new int[3];
		  Arrays.fill(numeros5, 7);
		  System.out.println(Arrays.toString(numeros5)); //llena todas las posiciones con el nummero 7
		  
        //Arrays.equals() : sirve para comparar si dos arreglos son iguales 
		  int [] A = {1, 2, 3};
		  int [] B = {1, 2, 3};
		  boolean iguales = Arrays.equals(a, b);
		  System.out.println(iguales); //nos devolvera TRUE porque en este caso los valores son iguales 
		  
		  
	//¿Cómo se recorren los arreglos en Java? hay varias maneras, aca vamos a poner en practica 3 
		  
		//For tradicional (con indices) : la usamos cuando queremos saber la posicion de un elemento 
		  int [] numeros6 = {10, 20, 30};
		  
		  for (int i =0; i < numeros.length; i++) {
			  System.out.println(numeros6[i]);  //el ciclo empieza de 0 y recorre hasta el ultimos valor
		  }
			  
		//For-each : se usa cuando solo queremos recorrer los valores sin importar su posicion 
		  int [] numeros7 = {10, 20, 30};
		  
		  for (int numero7 : numeros7) {
			  System.out.println(numero);
			  
		  }
		  
		//Streams (Arrays.stream()) : forma mas moderna para hacer el recorrido 
		  int [] numeros8 = {10, 20, 30};
		  Arrays.stream(numeros).forEach(n -> System.out.println(n)); //el arreglo se convierte a stream y luego forEach en este caso lo imprime 
		  
		  
	//Diferencias entre arreglos y ArrayList en Java : ambas sirven para guardar datos solo que cada una lo hace de una manera diferente 
		  
		 //TAMAÑO FIJO VS DINAMICO: 
		        //Arreglos (arrays) → Tamaño fijo : cuando creamos un arreglo e indicamos su tamaño no se puede cambiar despues 
		            int [] numeros9 = new int[5]; //aqui solo se puede guardar 5 numeros
		        //ArrayList → Tamaño dinámico : el tamaño puede crecer o disminuir automaticamente 
		            

		            ArrayList<Integer> numeros10 = new ArrayList<>();
		            numeros10.add(20);
		            numeros10.add(30); //podemos seguir agregando y agregando elementos sin preocuparnos el tamaño
		            
		 //TIPOS PRIMITIVOS VS CLASES ENVOLVENTES:
		        //Arreglos : pueden guardar tipos primitivos directamente 
		            int [] numeros11 = {1, 2, 3};
		        //ArraysList : no guarda tipos primitivos directamente, se deben usar clases envolventes 
		            ArrayList<Integer> numeros12 = new ArrayList<>();
		            
		 //METODOS DISPONIBLES: 
		        //Arreglos : no tienen muchos metodos propios y para saber el tamaño usamos: numeros.length 
		        //ArrayList : tiene varios metodos 
		          nmeros.add(10); //agregar
		          nmeros.remove(0); //eliminar por su posicion
		          nmeros.size(); //saber su tamaño
		          
		 //RENDIMIENTO: 
		        //Arrelos : son rapidos y consumen menos memoria 
		        //ArrayList : algo lento y usan mas memoria
		          
		 //¿CUANDO USAR CADA UNO?:
		        //Arreglos : cuando sabemos cuantos elementos guardaremos, si necesitamos mejor rendimiento y trabajamos con datos simples y fijos 
		        //ArrayList : cuando no sabemos cuantos elementos hay, o necesitamos agregar o eliminar algun dato mas facil   
		             
	
	}

}

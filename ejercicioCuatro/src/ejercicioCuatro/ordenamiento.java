package ejercicioCuatro;

import java.util.Arrays;
import java.util.Scanner;

public class ordenamiento {
	public static void main (String[]args) {
		//Creo un objeto scanner para obtener la entrada del teclado
		Scanner scanner = new Scanner(System.in);
		
		//Pedir al usuario que ingrese el primer numero
		System.out.println("Ingrese el primer número");
		int numero1 = scanner.nextInt();
		System.out.println("Ingrese el segundo número");
		int numero2 = scanner.nextInt();
		System.out.println("Ingrese el tercer número");
		int numero3 = scanner.nextInt();
		
		//Pedir al usuario los numeros en orden
		System.out.println("elige el orden de los numeros");
		String orden = scanner.next();
		
		//Cerrar el objeto scanner para evitar fugas de recursos
		scanner.close();
		
		//Ahora toca crear el array con los numeros ingresados
		int[] numeros= {numero1, numero2, numero3} ;
		
		//Ordenar el array segun la eleccion del usuario
		if (orden.equalsIgnoreCase("ascendente")) {
			Arrays.sort(numeros);
			
		}else if (orden.equalsIgnoreCase("descendente")) {
			Arrays.sort(numeros);
		
		//Invertir el array para obtener orden descendente

		for (int i = 0; i < numeros.length / 2; i++) {
			int temp = numeros [i];
			numeros[i] = numeros[numeros.length - 1 -i];
			numeros[numeros.length-1 - i] = temp;
			        
		}
		
	}
		System.out.println("Los números ordenados son:" );
		for (int num: numeros) {
		System.out.print(num + "");
		}
}
}
//Programa que muestra y cuenta los multiplos de 2 y 3 del 1 al 100

public class Programa5_MultiplosDe2Y3 {

	public static void main(String[] args) {

		// Declaracion y asignación de variables
		int contador = 0;

		// Mensaje por pantalla
		System.out.println("Los siguientes números son multiplos de 2 o de 3: ");

		// Bucle para recorrer del 1 al 100
		for (int i = 1; i <= 100; i++) {

			// Condición que muestra en pantalla números segun sean multiplos de 2 y 3 y los cuenta
			if (i % 2 == 0 ||i % 3 == 0) {
				System.out.print(i + " ");
				contador++;
				
			} 

		}
		// Mensaje Final
		System.out.print("\nNúmeros multiplos de 2 y de 3 hay: "+contador);
	}

}

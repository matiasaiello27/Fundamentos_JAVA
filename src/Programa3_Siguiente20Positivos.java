//Programa que pide un número y muestra los siguientes 20 numeros positivos

import java.util.Scanner;

public class Programa3_Siguiente20Positivos {

	public static void main(String[] args) {

		// Declaración e inicialización de variable
		int num = 0;

		// Declaración del objeto Scanner
		Scanner entrada = new Scanner(System.in);

		// Bucle que se asegura que el número sea positivo
		do {
			// Ingreso y lectura de datos 
			System.out.println("Decime un número POSITIVO: ");
			num = entrada.nextInt();
			// Mensaje que advierte al usuario que solo se admiten números positivos
			if (num <= 0) {
				System.out.println("No se admiten números negativos ni cero, proba de nuevo");
			}

		} while (num <= 0);
		
		System.out.println("Siguientes 20 números: ");
		// Bucle for que imprime los 20 siguientes números
		for (int i = num + 1; i <= (num + 20); i++) {
			
			System.out.print((i) + " ");
		}

		// Cerramos el scanner
		entrada.close();
	}

}

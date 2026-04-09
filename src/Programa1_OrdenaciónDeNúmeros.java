//Programa para ordenar números de manera ascendente o descendente según eliga el usuario

//Importamos el objeto Scanner
import java.util.Scanner;

public class Programa1_OrdenaciónDeNúmeros {

	public static void main(String[] args) {

		// Declaración del objeto Scanner
		Scanner entrada = new Scanner(System.in);

		// Declaramos e inicializamos las variables
		int num1 = 0, num2 = 0, num3 = 0, temporal = 0;
		String orden = "";

		// Ingreso de datos y lectura de datos
		System.out.println("Bienvenido!!! Ingresa tres numeros y te los ordeno segun me digas");

		System.out.println("Ingresa tu primer número: ");
		num1 = entrada.nextInt();

		System.out.println("Ingresa tu segundo número: ");
		num2 = entrada.nextInt();

		System.out.println("Ingresa tu tercer número: ");
		num3 = entrada.nextInt();

		// Limpia el buffer
		entrada.nextLine();

		// Bucle que asegura la correcta elección de A o D
		do {

			// Ingreso y lectura de datos
			System.out.println("Elige: orden ascendente (A) o descendente (D)");
			orden = entrada.nextLine();

			if (!orden.equalsIgnoreCase("a") && !orden.equalsIgnoreCase("d")) {

				System.out.println("Letra NO permitida, elegi entre A o D");
			}

		} while (!orden.equalsIgnoreCase("a") && !orden.equalsIgnoreCase("d"));

		// Se ordenan las variables, dejando siempre num1>num2>num3
		if (num1 < num2) {
			temporal = num1;
			num1 = num2;
			num2 = temporal;
		}
		if (num1 < num3) {
			temporal = num1;
			num1 = num3;
			num3 = temporal;
		}
		if (num2 < num3) {
			temporal = num2;
			num2 = num3;
			num3 = temporal;
		}

		// Según orden elegido, salida por consola de datos
		if (orden.equalsIgnoreCase("a")) {
			System.out.println("Orden ascendente: " + num3 + " " + num2 + " " + num1);
		} else if (orden.equalsIgnoreCase("d")) {
			System.out.println("Orden descendente: " + num1 + " " + num2 + " " + num3);
		}

		//Cerramos el Scanner
		entrada.close();
	}

}

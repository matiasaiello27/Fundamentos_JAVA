//Programa que calcula el IMC y nivel de peso

//Importamos el objeto Scanner
import java.util.Scanner;

public class Programa4_CalculadoraIMC {

	public static void main(String[] args) {

		// Declaración e inicialización de variables
		float peso = 0F, altura = 0F, imc = 0F;
		String nivelPeso = "";

		// Declaración de objeto Scanner
		Scanner entrada = new Scanner(System.in);

		// Bucle que se asegura que el peso igresado este entre el rango 30-300
		do {
			System.out.println("Ingresa tu peso (30-300) en Kilogramos: ");
			peso = entrada.nextFloat();

			if (peso < 30 || peso > 300) {
				System.out.println("Peso fuera de rango, prueba de nuevo.");
			}

		} while (peso < 30 || peso > 300);

		// Bucle que se asegura que la altura igresada este entre el rango 1.3-2
		do {
			System.out.println("Ingresa tu altura en Metros: ");
			altura = entrada.nextFloat();

			if (altura < 1.30 || altura > 2) {
				System.out.println("Altura fuera de rango, prueba de nuevo.");
			}

		} while (altura < 1.30 || altura > 2);

		// Asignamos valor al IMC
		imc = peso / (altura * altura);

		// Condicionales que asignan valor al nivel de peso según IMC
		if (imc < 18.5) {
			nivelPeso = "Bajo Peso";
		} else if (imc >= 18.5 && imc < 25) {
			nivelPeso = "Normal";
		} else if (imc >= 25 && imc < 30) {
			nivelPeso = "Sobrepeso";
		} else if (imc >= 30) {
			nivelPeso = "Obesidad";
		}

		// Finalmente se imprimen los datos del IMC y nivel de peso
		System.out.println("Tu IMC es: " + imc + "\nTu nivel de peso es: " + nivelPeso);

		// Cerramos el Scanner
		entrada.close();
	}
}

package dam2.inicial.ejercicio2;

import java.util.ArrayList;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		/**
		 * Ejercicio 2. Desarrolla un programa que lea una serie de valores numéricos
		 * enteros desde el teclado y los guarde en un ArrayList de tipo Integer. La
		 * lectura de números terminará cuando se introduzca el valor -1. Este valor no
		 * se almacenará en el ArrayList. A continuación el programa mostrará por
		 * pantalla el número de valores que se han leído, su suma y su media. Por
		 * último se mostrarán todos los valores leídos, indicando cuántos de ellos son
		 * mayores que la media.
		 */
		Scanner sc = new Scanner(System.in);

		// CREACION DEL ARRAY DE TIPO INTEGER

		ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();

		int numEntero;

		// BUCLE QUE SOLICITA EL VALOR AL USUARIO Y LO ALMACENA, SI INTRODUCE -1 EL
		// BUCLE PARA SIN ALMACENAR EL -1

		do {
			System.out.println("introduzca numero entero");
			numEntero = sc.nextInt();

			if (numEntero != -1 /* && numEntero > -1 */) {
				numerosEnteros.add(numEntero);
			}

		} while (numEntero != -1);

		// IMPRIME TODOS LOS NUMEROS ENTEROS INTRODUCIDOS EN EL ARRAY

		System.out.println(numerosEnteros.toString());

		// CALCULA LA SUMA DE TODOS LOS NUMEROS ENTEROS INTRODUCIDOS EN EL ARRAY

		double suma = calcularSuma(numerosEnteros);

		// IMPRIME LA SUMA

		System.out.println("La suma es: " + suma);

		// CALCULA LA MEDIA DE LOS NUMEROS ENTEROS INTRODUCIDOS EN EL ARRAY

		double media = calcularMedia(numerosEnteros);

		// IMPRIME LA MEDIA

		System.out.println("La media es: " + media);

		// CREO OTRO ARRAY PARA ALMACENAR LOS NUMEROS MAYORES A LA MEDIA
		ArrayList<Integer> numerosMayoresMedia = new ArrayList<Integer>();

		System.out.println("de todos estos números: " + numerosEnteros.toString());

		// RECORRO EL ARRAY PARA ENCONTRAR LOS NUMEROS MAYORES A LA MEDIA Y LOS AÑADO AL
		// NUEVO ARRAY

		for (int i = 0; i < numerosEnteros.size(); i++) {
			if (numerosEnteros.get(i) > media) {
				Integer num = numerosEnteros.get(i);
				numerosMayoresMedia.add(num);
			}
		}

		System.out.println("Los que superan la media son: " + numerosMayoresMedia.toString());
	}

	// FUNCIÓN QUE CÁLCULA LA SUMA DE LOS NÚMEROS ENTEROS ALMACENADOS EN EL ARRAY

	public static double calcularSuma(ArrayList<Integer> numerosEnteros) {
		double suma = 0;
		for (int i = 0; i < numerosEnteros.size(); i++) {
			suma = suma + numerosEnteros.get(i);
		}
		return suma;
	}

	// FUNCIÓN QUE CÁLCULA LA MEDIA DE LOS NÚMEROS ENTEROS ALMACENADOS EN EL ARRAY

	public static double calcularMedia(ArrayList<Integer> numerosEnteros) {
		double media = 0;
		for (int i = 0; i < numerosEnteros.size(); i++) {
			media = media + numerosEnteros.get(i);
		}
		return media / numerosEnteros.size();
	}

}

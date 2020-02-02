package tarea6;

import java.util.Scanner;

public class deStringAChar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingresa una palabra");
		String sCadena = teclado.next();

		char[] aCaracteres = sCadena.toCharArray();

		for (int i = 0; i < aCaracteres.length; i++) {
			System.out.println("  " + aCaracteres[i]);
		}

	}
}
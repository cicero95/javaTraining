package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

import java.util.Scanner;

/**
 * @author cicinho
 *  	   Fazer um programa para ler um número inteiro e dizer se este
 *         número é par ou ímpar.
 */

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int number;

		System.out.print("enter the number: ");
		number = sc.nextInt();

		if (number % 2 == 0) {
			System.out.println("the number " + number + " is EVEN");
		} else {
			System.out.println("the number " + number + " is ODD");
		}

	}

}

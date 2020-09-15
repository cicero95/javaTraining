package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
 */

import java.util.Scanner;

public class uri1018 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println("num => "+ i);
			}
		}
	}
}

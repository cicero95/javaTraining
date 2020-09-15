package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;
import java.util.Scanner;

/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/


public class uri1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of intervals");

		int n = sc.nextInt();
		System.out.println("******************************************");

		int in = 0;

		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
				System.out.println(x + " in");
			} else {
				out = out + 1;
				System.out.println(x + " out");
			}
		}
		System.out.println("******************************************");

		System.out.println(in + " in");
		System.out.println(out + " out");

	}
}

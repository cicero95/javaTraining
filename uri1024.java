package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author cicinho 
 * 
 * 		   Fazer um programa para ler um número inteiro positivo N. O
 *         programa deve então mostrar na tela N linhas, começando de 1 até N.
 *         Para cada linha, mostrar o número da linha, depois o quadrado e o
 *         cubo do valor, conforme exemplo.
 */

public class uri1024 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("******************************************");

		for (int i = 1; i <= number; i++) {
				int first = i;
				int second = i * i;
				int third = i * i * i;
				System.out.printf("%d %d %d%n", first, second, third);
		}
	}
}

package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;
import java.util.Scanner;

/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
*/

public class uri1020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("******************************************");

		for (int i = 0; i < number; i++) {

			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();

			double weighted_average = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

			if(n1< n2 && n1 < n3) {
				System.out.println("n1 and lower");
			}else if(n2 < n1 && n2 < n3) {
				System.out.println("n2 and lower");

			}else {
				System.out.println("n3 and lower");

			}
			
			System.out.printf("weighted average %.1f%n", weighted_average);
			
			if(weighted_average < 7) {
				System.out.println("That's wrong !!");
			}else {
				System.out.println("It was grandpa who taught!!");
			}
		}
	}
}

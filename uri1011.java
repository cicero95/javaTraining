package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

import java.util.Scanner;

/**
 * @author cicinho
 *  	   Você deve fazer um programa que leia um valor qualquer e
 *         apresente uma mensagem dizendo em qual dos seguintes intervalos
 *         ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
 *         Obviamente se o valor não estiver em nenhum destes intervalos, deverá
 *         ser impressa a mensagem “Fora de intervalo”.
 */

public class uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double number = sc.nextDouble();

		if ((number >= 0) & (number <= 25)) {
			System.out.println("range 0,25");
		} else if ((number > 25) & (number <= 50)) {
			System.out.println("range 25,50");
		} else if ((number > 50) & (number <= 75)) {
			System.out.println("range 50,75");
		} else if ((number > 75) & (number <= 100)) {
			System.out.println("range 75,100");
		} else {
			System.out.println("Out of range");
		}
//		
//		if (number < 0 || number > 100.0) {
//			System.out.println("Out of range");
//		}
//		
//		else if (number <= 25.0) {
//			System.out.println("range 0,25");
//		}
//		else if (number <= 50.0 ) {
//			System.out.println("range 25,50");
//		}
//		else if (number <= 75.0) {
//			System.out.println("range 50,75");
//		}	
//		
//		else {
//			System.out.println("range 75,100");
//		}

	}

}

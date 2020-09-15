package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author cicinho
 *Ler um número inteiro N e calcular todos os seus divisores.
 */

public class uri1023 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("******************************************");
		for(int i = number; i >0; i-- ) {
			if(number % i == 0) {
				System.out.println(i);
			}
		}

	}
}

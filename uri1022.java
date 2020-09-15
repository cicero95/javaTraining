package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author cicinho
 *Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

public class uri1022 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("******************************************");

		for(int n =0; n<number; n++) {
			
			int x  = sc.nextInt();
			int y = sc.nextInt();
			
			if(y == 0) {
				System.out.println("Impossible division!!");
			}else {
				float result = x / y;
				System.out.printf(" the result is %.1f%n", result);
			}
		}
	}
}

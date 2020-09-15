package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;
import java.util.Locale;

/*
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

import java.util.Scanner;

public class uri1007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.print("enter the number: ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("POSITIVE NUMBER");
		}else {
			System.out.println("NEGATIVE NUMBER");
		}
		
	}		

}

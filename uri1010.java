package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;
import java.util.Locale;

/*
 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */

import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the number 1: ");
		int A = sc.nextInt();
		System.out.print("enter the number 2: ");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("MULTIPLES");
		}
		else {
			System.out.println("NOT MULTIPLES");
		}
		
		
	}		

}

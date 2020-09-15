package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Scanner;

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

public class uri1003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, difference;

		System.out.println("enter the value of A");
		A = sc.nextInt();
		System.out.println("enter the value of B");
		B = sc.nextInt();
		System.out.println("enter the value of C");
		C = sc.nextInt();
		System.out.println("enter the value of D");
		D = sc.nextInt();

		difference = (A * B - C * D);
		System.out.println("difference = " + difference);

	}

}

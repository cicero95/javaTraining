package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X axis");
		double X = sc.nextDouble();
		System.out.println("Enter Y axis");
		double Y = sc.nextDouble();

		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.println("First");
			} else if (X < 0 && Y > 0) {
				System.out.println("Second");
			} else if (X < 0 && Y < 0) {
				System.out.println("third");
			} else if(X > 0 && Y < 0){
				System.out.println("fourth");
			}else {
				System.out.println("FINISHED!");
			}
			X = sc.nextDouble();
			Y = sc.nextDouble();
				
		}

	}

}

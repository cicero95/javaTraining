package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;
import java.util.Locale;

import java.util.Scanner;

/*
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */

public class uri1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X axis");
		double x = sc.nextDouble();
		System.out.println("Enter Y axis");
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {

			System.out.println("Initial");
		}
		else if (x == 0) {
			System.out.println("X axis");
		}
		else if (y == 0) {
			System.out.println("Y axis");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
	}		

}

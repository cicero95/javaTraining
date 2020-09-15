package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

/**
 * @author cicinho
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

import java.util.Scanner;

public class uri1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double A, B, C, triangle, circle, trapeze, square, rectangle;

		int separator = 30;
		System.out.print("enter the value of A: ");
		A = sc.nextDouble();

		System.out.print("enter the value of B: ");
		B = sc.nextDouble();

		System.out.print("enter the value of C: ");
		C = sc.nextDouble();

		triangle = A * C / 2.0;
		circle = 3.14159 * C * C;
		trapeze = (A + B) / 2.0 * C;
		square = B * B;
		rectangle = A * B;

		for (int i = 0; i < separator; i++) {
			System.out.print("=");
		}
		System.out.println();

		System.out.printf("TRIANGULO: %.3f%n", triangle);
		System.out.printf("CIRCULO: %.3f%n", circle);
		System.out.printf("TRAPEZIO: %.3f%n", trapeze);
		System.out.printf("QUADRADO: %.3f%n", square);
		System.out.printf("RETANGULO: %.3f%n", rectangle);

	}

}

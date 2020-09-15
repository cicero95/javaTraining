package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Scanner;

/**
 * @author cicinho 
 * 		   Faça um programa para ler o valor do raio de um círculo, e
 *         depois mostrar o valor da área deste círculo com quatro casas
 *         decimais conforme exemplos.
 */

public class uri1002 {

	public static void main(String[] args) {
		Float RAIO, AREA, pi = 3.14159f;

		RAIO = new Scanner(System.in).nextFloat();

		AREA = (pi * RAIO * RAIO);
		System.out.printf("A=%.4f%n ", AREA);
	}

}

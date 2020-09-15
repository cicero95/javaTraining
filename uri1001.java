package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Scanner;

/**
 * @author cicinho 
 * 		   Faça um programa para ler dois valores inteiros, e depois
 *         mostrar na tela a soma desses números com uma mensagem explicativa,
 *         conforme exemplos.
 */

public class uri1001 {

	public static void main(String[] args) {
		int num1, num2, soma;

		num1 = new Scanner(System.in).nextInt();
		num2 = new Scanner(System.in).nextInt();

		soma = num1 + num2;

		System.out.println("a soma é :" + soma);
	}

}

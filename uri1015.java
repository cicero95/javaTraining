package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

import java.util.Scanner;

public class uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a password");
		int password = sc.nextInt();

		while (password != 2020) {
			System.err.println("Invalid password!");
			password = sc.nextInt();
		}
		System.out.println("Access Allowed!");

	}

}

package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */

import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasoline = 0;
		int diesel = 0;

		System.out.println("Enter a code for the fuel");
		int choice = sc.nextInt();

		while (choice != 4) {
			if (choice == 1) {
				alcool = alcool + 1;
				System.out.println("Alcool: " + alcool);
			} else if (choice == 2) {
				gasoline = gasoline + 1;
				System.out.println("Gasoline: " + gasoline);
			} else if (choice == 3) {
				diesel = diesel + 1;
				System.out.println("Diesel: " + diesel);
			}else {
				System.out.println("INVALID CODE");
			}
			choice = sc.nextInt();
		}
		System.out.println("THANKS :)");
		System.out.println("");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasoline);
		System.out.println("Diesel: " + diesel);
	}

}

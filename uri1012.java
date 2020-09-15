package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

import java.util.Scanner;

/**
 * @author cicinho
 *  	   Com base na tabela abaixo, escreva um programa que leia o
 *         código de um item e a quantidade deste item. A seguir, calcule e
 *         mostre o valor da conta a pagar.
 */

public class uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the code number ");
		int code_item = sc.nextInt();

		System.out.println("enter the quantity");
		int quantity = sc.nextInt();

		double total_pay = 0.0;

		if (code_item == 1) {

			total_pay = (quantity * 4.00);

		} else if (code_item == 2) {
			total_pay = (quantity * 4.50);

		} else if (code_item == 3) {
			total_pay = (quantity * 5.00);

		} else if (code_item == 4) {
			total_pay = (quantity * 2.00);

		} else if (code_item == 5) {
			total_pay = (quantity * 1.50);
		} else {
			System.out.printf("INVALID NUMBER!");
		}

		System.out.printf("TOTAL PAY : %.2f", total_pay);

	}

}

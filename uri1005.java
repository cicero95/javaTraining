package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;
import java.util.Locale;

import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class uri1005 {

	public static void main(String[] args) throws InterruptedException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int part_code1, 
		part_code2, 
		part_number1, 
		part_number2;
		
		double unit_value1, unit_value2, total;
		
		int separator = 30;
		
		System.out.print("enter the part code 1: ");
		part_code1 = sc.nextInt();
		
		System.out.print("enter the part number 1: ");
		part_number1 = sc.nextInt();
		
		System.out.print("enter the unit value1: ");
		unit_value1 = sc.nextDouble();
		
		for (int i = 0; i < separator; i++) {
			System.out.print("=");
		}
		System.out.println();	
		
		
		System.out.print("enter the part code 2: ");
		part_code2 = sc.nextInt();
		
		System.out.print("enter the part number 2: ");
		part_number2 = sc.nextInt();
		
		System.out.print("enter the unit value2: ");
		unit_value2 = sc.nextDouble();
		
		total = unit_value1 * part_number1 + unit_value2 * part_number2;
		
		System.out.println("Calculando...");
		Thread.currentThread();
		Thread.sleep(3000);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		
	}

}

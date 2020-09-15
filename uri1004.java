package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

import java.util.Scanner;

/* * 
 * @author cicinho
 * 			Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
			hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
			decimais.
 */

public class uri1004 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int employee_number, worked_hours;
		double amount_receivable = 0;

		double salary;

		System.out.print("enter the employee number: ");
		employee_number = sc.nextInt();

		System.out.print("enter the worked hours: ");
		worked_hours = sc.nextInt();

		System.out.print("enter the amount receivable: ");
		amount_receivable = sc.nextDouble();

		salary = (worked_hours * amount_receivable);
		System.out.println("NUMBER " + employee_number);
		System.out.printf("SALARY = U$ %.2f", salary);

	}

}

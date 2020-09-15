package curso_nelio_java.pdfsjavanlioalves.ExResolvidos;

import java.util.Locale;

import java.util.Scanner;

/**
 * @author cicinho 
 * 		   Leia a hora inicial e a hora final de um jogo. A seguir
 *         calcule a duração do jogo, sabendo que o mesmo pode começar em um dia
 *         e terminar em outro, tendo uma duração mínima de 1 hora e máxima de
 *         24 horas.
 */

public class uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int initial_hour, final_hour;
		System.out.print("enter the initial hour: ");
		initial_hour = sc.nextInt();
		System.out.print("enter the final hour: ");
		final_hour = sc.nextInt();

		int time;
		if (initial_hour < final_hour) {
			time = initial_hour - final_hour;
		} else {
			time = 24 - initial_hour + final_hour;
		}

		System.out.println("THE GAME LASTED " + time + " HOURS");

	}

}

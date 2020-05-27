// java - solução por Dasvache

package maratona;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int x, y, rep = 1, cont = 1;

		Scanner sentinela = new Scanner(System.in);

		System.out.print("Insira o valor de 'x': ");
		x = sentinela.nextInt();
		System.out.print("Insira o valor de 'y': ");
		y = sentinela.nextInt();

		while (rep <= y) {

			System.out.print(rep + "\t");

			if (cont == x) {

				System.out.print("\n");
				cont = 0;

			}

			cont++;
			rep++;

		}

		sentinela.close();
	}
}

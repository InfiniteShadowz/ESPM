// Java

package maratona;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int saque, qtdNota = 0;
		boolean i = true;
		
		System.out.print("saque = ");
		saque = input.nextInt();
		
		while (i) {
			
			if(saque % 2 != 0) {
				
				qtdNota = 1;
				saque = saque - 5; 
				qtdNota += saque / 100;
				saque = saque - 100 * (saque / 100);
				qtdNota += saque / 50;
				saque = saque - 50 * (saque / 50);
				qtdNota += saque / 20;
				saque = saque - 20 * (saque / 20);
				qtdNota += saque / 10;
				saque = saque - 10 * (saque / 10);
				qtdNota += saque / 2;
				saque = saque - 2 * (saque / 2);
				i = false;			
			}
			else {
				qtdNota += saque / 100;
				saque = saque - 100 * (saque / 100);
				qtdNota += saque / 50;
				saque = saque - 50 * (saque / 50);
				qtdNota += saque / 20;
				saque = saque - 20 * (saque / 20);
				qtdNota += saque / 10;
				saque = saque - 10 * (saque / 10);
				qtdNota += saque / 2;
				saque = saque - 2 * (saque / 2);
				qtdNota += saque / 5;
				saque = saque - 5 * (saque / 5);
				i = false;
			}

		}
		
		System.out.println(qtdNota);
		System.out.println(saque);
		
		input.close();
		
	}

}


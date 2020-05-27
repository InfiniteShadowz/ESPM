package maratona;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		long n, maior, fator;
		
		
		maior = 0;
		n = input.nextLong();
		fator = 2;
		
		while (n > 1) {
			while (n % fator == 0) {
				n = n / fator;
				if (fator > maior) {
					maior = fator;
				}
			}
			fator += 1;
			
		}
		
		System.out.println(maior);
		
		input.close();

	}

}

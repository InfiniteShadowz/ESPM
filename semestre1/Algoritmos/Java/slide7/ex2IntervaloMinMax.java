package slide7;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int menor, maior;
		
		menor = input.nextInt();
		maior = input.nextInt();
		
		while(menor != maior + 1) {
			System.out.println(menor);
			menor = menor + 1;
		}
		
		input.close();
		
	}

}

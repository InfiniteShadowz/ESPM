package slide7;

import java.util.Scanner;

public class exercicio5Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int fatorial, n;
		
		fatorial = 1;
		
		System.out.print("Digite um número n para saber seu fatorial: ");
		n = input.nextInt();
		
		while (n < 0 ) {
			System.out.println("");
			System.out.print("Digite um número n para saber seu fatorial: ");
			n = input.nextInt();
		}
		
		while ( n != 0) {
			fatorial = fatorial * n;
			n -= 1;
			
		}
		
		System.out.println("O fatorial de n é: "+fatorial);
		
		input.close();
	}

}

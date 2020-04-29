package slide7;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double stop = 3;
		double maior;
		
		System.out.print("Digite um numero (ou digite 0 para parar): ");
		stop = input.nextDouble();
		
		maior = stop;
		
		while (stop != 0) {
			System.out.print("Digite um numero (ou digite 0 para parar): ");
			stop = input.nextDouble();
			
			if(stop > maior && stop != 0) {
				maior = stop;
			}
		}
		
		System.out.print("O maior valor digitado foi: "+maior);
		
		input.close();

	}

}

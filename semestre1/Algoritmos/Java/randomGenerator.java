package primos;

import java.util.Random;
import java.util.Scanner;

public class numeroRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random gerador = new Random();
		
		
		int chute;
		int valor = gerador.nextInt(60)+1;
		double casca = gerador.nextDouble();
		System.out.println(valor);
		
		do {
			
			System.out.println("Digite um número: ");
			chute = input.nextInt();
			
			
		} while (chute != valor);
		
		System.out.println("Acertou!");
		
		
		
		input.close();

	}

}

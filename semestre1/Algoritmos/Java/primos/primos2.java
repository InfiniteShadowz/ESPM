package primos;

import java.util.Scanner;

public class primos2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n; //qnt de loops
		int valor; // numero que sera testado
		int qtd;
		long inicio, fim; // variaveis para armazenar inicio e fim do tempo de processamento
		
		System.out.println("Informe a quantidade de testes: ");
		n = input.nextInt();
		
		inicio = System.currentTimeMillis();
		
		for(int i= 1; i <= n; i++) {
			System.out.print("informe o valor de teste: ");
			valor = input.nextInt();
			qtd = 0;
			for (int j = 2; j <= Math.sqrt(valor); j++) {
				if(valor % j == 0) {
					qtd++;
					break;
				}
				
			}
			System.out.println(qtd == 0 ?"Primo": "Não Primo");
			
		}
		
		fim = System.currentTimeMillis();
		System.out.println(fim-inicio);
		
		input.close();

	}

}

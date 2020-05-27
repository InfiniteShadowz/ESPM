// java

package maratona;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, aux = 1,  soma;
		long x;
		boolean num = false;
		
		System.out.print("N = ");
		n = input.nextInt();
		
		x = n*2;
		
		soma = 0;
		
		while (num == false) {
			aux = 1;
			soma = 0;
			x += 1;
			while (aux <= n){
				
				if (x % aux == 0) {
					soma ++;
				}
				
				if (soma == n) {
					num = true;					
					break;
				}
				
				aux += 1;
			}	
			
		}
		System.out.println(x);
		
		input.close();
	}

}

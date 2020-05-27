// java

package maratona;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N, aux = 1, aux1 = 2, aux2 = 3;
		
		System.out.print("N = ");
		N = input.nextInt();
		
		while (N > 0) {
			System.out.println(aux + " " + aux1 + " " + aux2 + " PUM");
			aux += 4;
			aux1 += 4;
			aux2 += 4;
			
			N -= 1;
		}
		
		input.close();

	}

}

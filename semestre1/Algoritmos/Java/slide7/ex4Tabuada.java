package slide7;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int base, mult, result, repeat;
		
		repeat = 1;
		mult = 0;
		
		System.out.print("Digite um valor para consultar susa tabuada até 10:");
		base = input.nextInt();
		
		while(mult <= 10 && repeat == 1) {
			result = base * mult;
			System.out.print(result+"\t");
			mult += 1;
			if(mult == 11) {
				System.out.println("");
				System.out.print("Deseja repetir a impressão? 1 = sim ; 0 = não: ");
				repeat = input.nextInt();
				mult = 0;
			}
		}
		
		input.close();

	}

}

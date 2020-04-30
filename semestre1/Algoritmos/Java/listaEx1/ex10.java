import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Declarando variaveis
		double C, F;
		
		//Sout + input
		System.out.print("Digite a temperatura em °C que deseja converter: ");
		C = input.nextDouble();
		
		//Processamento (calculo de fahrenheit)
		F = ( 9 * C / 5 ) + 32;
		
		//Output com uma casa decimal
		System.out.printf("O resultado em Fahrenheit é de: °%.1f graus.", F);
		
		//fecha input
		input.close();
    
    }
    
}

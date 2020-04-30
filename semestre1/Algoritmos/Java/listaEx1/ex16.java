import java.util.Scanner;

public class exercicio16IMC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double imc, altura, peso;
		
		System.out.print("Digite sua altura: ");
		altura = input.nextDouble();
		System.out.print("Digite seu peso: ");
		peso = input.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é: "+imc);
		
		input.close();

	}

}

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int anoNascimento, anoAtual, idade, idade2050;
		
		System.out.print("digite seu ano de nascimento:");
		anoNascimento = input.nextInt();
		System.out.print("digite o ano atual");
		anoAtual = input.nextInt();
		
		idade = anoAtual - anoNascimento;
		idade2050 = idade + (2050 - anoAtual);
		
		System.out.println("Sua idade é: "+ idade);
		System.out.println("Sua idade em 2050 será de: "+ idade2050);
		
		input.close();
	}

}

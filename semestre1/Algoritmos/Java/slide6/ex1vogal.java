import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String x;
		
		System.out.println("Digite uma letra:");
		x = input.next();
		
		if (x.equalsIgnoreCase("a") || x.equalsIgnoreCase("i") || x.equalsIgnoreCase("u") || x.equalsIgnoreCase("e") || x.equalsIgnoreCase("o")) {
			System.out.println("é Vogal!!!!");
		}
		else {
			System.out.println("Não é vogal!!!!");
		}
		
		input.close();

	}

}

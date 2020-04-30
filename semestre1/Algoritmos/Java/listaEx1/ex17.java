import java.util.Scanner;

public class exercicio17comercio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double vlProd, desc, vlProdF, vlDesc;
		
		System.out.print("Digite o valor do produto: ");
		vlProd = input.nextDouble();
		System.out.print("Digite o desconto em % (0 a 100): ");
		desc = input.nextDouble();
		
		vlDesc = vlProd * (desc/100);
		vlProdF = vlProd - vlDesc;
		
		System.out.println("O novo valor do produto é de: R$ "+vlProdF);
		System.out.println("O valor descontado foi: R$ "+vlDesc);
		
		
		input.close();
	}

}

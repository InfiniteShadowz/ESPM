import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double numHoraTrab, valHoraTrab, salMin, salReceb, imposto, salBruto;
		
		numHoraTrab = input.nextDouble();
		salMin = input.nextDouble();
		
		valHoraTrab = salMin / 2;
		salBruto = numHoraTrab * valHoraTrab;
		imposto = salBruto * 0.03;
		
		salReceb = salBruto - imposto;
		
		System.out.printf("O salario bruto é de: R$%.2f", salReceb);
		
		
		input.close();

	}

}

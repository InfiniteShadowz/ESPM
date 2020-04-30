import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Declarando variaveis
		double SB, HA, DSR, salarioMensal, qntAulasSemanais, valorAula;
		
		//Sout + input
		System.out.print("Digite a quantidade de aulas semanais: ");
		qntAulasSemanais = input.nextDouble();
		System.out.print("Digite o valor/aula do professor: ");
		valorAula = input.nextDouble();
		
		//Processamento
		SB = qntAulasSemanais * 4.5 * valorAula;
		
		HA = 0.05 * SB;
		
		DSR = 1/6 * (SB + HA);
		
		salarioMensal = SB + HA + DSR;
		
		
		//OUTPUT
		System.out.printf("O salário mensal do professor é de: ", salarioMensal);
		
		
		//fecha input
		input.close();
    
    }
}

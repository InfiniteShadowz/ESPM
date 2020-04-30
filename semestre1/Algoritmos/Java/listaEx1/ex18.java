import java.util.Scanner;

public class exercicio18combustivel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double litro, km, tempo, velMedia;
		
		System.out.print("digite o tempo de duração da viagem: ");
		tempo = input.nextDouble();
		System.out.print("digite a velocidade media: ");
		velMedia = input.nextDouble();
		
		km = velMedia * tempo;
		litro = km / 12;
	
    System.out.println("a litragemm gasta foi de: "+litro);
		
		input.close();
		
		

	}

}

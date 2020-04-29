package slide7;

import java.util.Scanner;

public class exercicio6Alunos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nAlunos;
		double nota1, nota2, media;
		
		System.out.print("Digite o numero de alunos: ");
		nAlunos = input.nextInt();
		
		while (nAlunos != 0) {
			System.out.println("");
			System.out.print("nota da primeira prova:");
			nota1 = input.nextDouble();
			System.out.print("nota da segunda prova:");
			nota2 = input.nextDouble();
			
			media = (nota1 + nota2)/2;
			System.out.println(media);
			if(media>= 7 ) {
				System.out.println("APROVADO");
			}
			else if (media < 5) {
				System.out.println("REPROVADO");
			}
			else {
				System.out.println("EXAME");
			}
			
			nAlunos -= 1;
			
		}
		
		System.out.println("----END----");
		
		input.close();
	}

}

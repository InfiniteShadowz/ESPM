public class exercicio6 {

	public static void main(String[] args) {
		/* 6.Supondo que a, b e c são variáveis do tipo inteiro, com valores iguais a 3, 8 e -6, respectivamente, e uma variável real d, com valor 2,5. 
		 * Resolva cada uma das expressões aritméticas abaixo. 
		 * a)–c * 2 * a % 3 + c 
		 * b)Math.sqrt(-6*c) / 4 % b 
		 * c)30 / a / 2 + Math.pow(8, 2) / 2 % c 
		 * d)34 % b % 5 * Math.pow(2, 3) % b * -1 / (a + c)  
		 * e)Math.pow(-c, 2) + d * 10 / a  
		 * */
		
		int a, b, c;
		double d, firstEx, secondEx, thirdEx, fourthEx, fifthEx;
		
		a = 3;
		b = 8;
		c = -6;
		d = 2.5;
		
		//a)
		firstEx = -c * 2 * a % 3 + c;
		//b)
		secondEx = Math.sqrt(-6*c) / 4 % b;
		//c)
		thirdEx = 30 / a / 2 + Math.pow(8,  2) / 2 % c;
		//d)
		fourthEx = 34 % b % 5 * Math.pow(2, 3) % b -1 / (a+c);
		//e)
		fifthEx =  Math.pow(-c, 2) + d * 10 / a; 
	}

}

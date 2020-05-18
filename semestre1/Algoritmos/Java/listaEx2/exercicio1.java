public class exercicio1 {

	public static void main(String[] args) {
		
		int A = 6, B = 3, C = 2;
		boolean res;
		
		// a)
		res = (A + B / C) < (C / A + 4);
		System.out.println("a) "+res);
		// b)
		res = ((B%C)+3) >= (B%A)+(C%B);
		System.out.println("b) "+res);
		// c)
		res = ((B%C)+3) <= (B%A)+(C%B);
		System.out.println("c) "+res);
		// d)
		res = A*B == A+B-3+C/4;
		System.out.println("d) "+res);
		// e)
		res = A/B%B%A%C != B%A%B%C%A;
		System.out.println("e) "+res);
		
		
		input.close();
		
	}

}

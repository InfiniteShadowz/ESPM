
public class exercicio2 {

	public static void main(String[] args) {
		
		int a = 2, b = 7;
		double c = 3.5;
		boolean d = false, e = true, res;
		
		// a)
		res =  b == a * c && (d || b != c);
		System.out.println("a) "+res);
		// b)
		res = b > a || b == Math.pow(a, a);
		System.out.println("b) "+res);
		
		// c)
		res = d && b / a >= c || !(a <= c) ;
		System.out.println("c) "+res);		
		
		// d)
		res = !(d) && Math.sqrt(a+b) >= c;
		System.out.println("d) "+res);
		
		// e)
		res = b / a == c || b / a != c;
		System.out.println("e) "+res);
		
		// f)
		res = d || Math.pow(b, a) <= c * 10 + a * b;
		System.out.println("f) "+res);
		
		// g)
		res = d || e || (e || d && !(d || d)); 
		System.out.println("g) "+res);
		
		
	}

}

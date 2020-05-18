import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		if (x> y) {
			y = x/y;
			
		}
		
		if (x <= y && y != 7) {
			x = x + y;
			y = y-5;
		}
		else {
			y = x - y;
		}

	}

}

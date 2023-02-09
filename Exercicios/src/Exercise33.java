import java.util.Scanner;


//Write a java program and compute the sum of the digits of an integer.

public class Exercise33 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input an integer: ");
		
		long a = sc.nextLong();
		
		long c;
		
		long b;
		
		c = a % 10;
		
		a = a/10;
		
		c = c + (a % 10);
		
		a = a/10;
		
		c = c + (a % 10);
		
		System.out.println("A sum of the digits is: " + c);

	}

}

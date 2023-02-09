import java.util.Scanner;

public class Exercise15 {
	public static void main(String[] args) {
		//Write a java program to swap two variables.
	int c;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input the first variable: ");
	int a = sc.nextInt();
	
	
	System.out.println("Input the second variable: ");
	int b = sc.nextInt();
	
	System.out.println("Before swaping: " + a + ", " + b);
	
	// Use a temporary variable to swap...
	c = a;
	a = b;
	b = c;
	
	System.out.println("After swaping: " + a + " " + b);
	
	}

}

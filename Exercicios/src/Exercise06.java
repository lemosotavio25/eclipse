import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the first number: ");
		
		int x = sc.nextInt();
		
		System.out.println("Input the second number: ");
		
		int y = sc.nextInt();
		
		System.out.println(x + " + " + y + " = " + (x+y));
		System.out.println(x + " - " + y + " = " + (x-y));
		System.out.println(x + " * " + y + " = " + (x*y));
		System.out.println(x + " / " + y + " = " + (x/y));
		System.out.println(x + " mod " + y + " = " + (x%y));
	}

}

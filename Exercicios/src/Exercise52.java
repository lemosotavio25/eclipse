import java.util.Scanner;

//Write a Java Program to calculate the sum of two integers and return true if the sum is equal to a third integer;

public class Exercise52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the first number:" );
		int a = sc.nextInt();
		
		System.out.println("Input the second number:");
		int b = sc.nextInt();
			
		System.out.println("Input the third number:");
		int c = sc.nextInt();
		
		System.out.print("The result is: " + test(a,b,c));
	}
	
	// -> || or    , && and - negative numbers
	public static boolean test(int p, int q, int r)
	{
		return ((p + q) == r || (q + r) == p || (r + p) == q);
	}
}

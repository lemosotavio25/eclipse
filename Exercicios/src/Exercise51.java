import java.util.Scanner;

// Write a Java program to convert a string to an integer in Java

public class Exercise51 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number(string): ");
	
	String number = sc.nextLine();
	
	//Integer.parseInt(x)....
	int result = Integer.parseInt(number);
	
	System.out.printf("The integer values is: %d", result);
	System.out.printf("\n");

}
}
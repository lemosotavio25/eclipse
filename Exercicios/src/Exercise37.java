import java.util.Scanner;

//Write a program to reverse a string
// for loop and "normal print Array"
// toCharArray -> String to array?

public class Exercise37 {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a string: ");
	char[] letters = sc.nextLine().toCharArray();
	System.out.println("Reverse string: ");
	for (int i = letters.length - 1; i >= 0; i--) {
		System.out.print(letters[i]);
	}
	System.out.println("\n");
	
	
	
	}
}

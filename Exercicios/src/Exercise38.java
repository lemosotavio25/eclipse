import java.util.Scanner;

// Write a Java program to count the letters, spaces numbers and other characters of an input String.

//Character.isLetter,Character.isDigit.... i
public class Exercise38 {
	public static void main(String[] args) {
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input a string: ");
// Array of characters[] letters = ->characters to array.
	char[] letters = sc.nextLine().toCharArray();
	
//For statement to verify the characters in the array
	for(int i = 0; i < letters.length; i ++) {
		
//If else statement to verify every type of characters -> letters, numbers, spaces and others....
		if(Character.isLetter(letters[i])) {
			letter ++;
	}
		else if(Character.isDigit(letters[i])) {
			num ++;	
	}
		else if(Character.isSpaceChar(letters[i])) {
			space ++;	
	}
		else{
			other ++;	
	}
	}
	System.out.println("Total of letters: " + letter);
	System.out.println("Total of numbers: " +num);
	System.out.println("Total of spaces: " +space);
	System.out.println("Total of others: " +other);
}
}

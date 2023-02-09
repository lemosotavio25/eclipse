// Write a JAva program to print the odd numbers from 1 to 99. Prints one number per line.

public class Exercise48 {
	public static void main(String[] args) {
		
	System.out.println("Odd numbers are:");
	for(int i = 0; i <= 99; i++) {
		if((i % 2) == 1) {
			System.out.print(" " + i);
		}
	}

}
	
}

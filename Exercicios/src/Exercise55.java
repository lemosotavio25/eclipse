import java.util.Scanner;

// Write a java program to convert seconds to hour, minutes and seconds.

public class Exercise55 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input seconds:" );
		double seconds = sc.nextDouble();
		
		double hours;
		
		double minutes;
		
		double newSeconds;
		
		hours = seconds/(60*60);
		
		int h = (int)hours;
		
		minutes = ((seconds%3600)/60);
		
		int m = (int)minutes;
		
		newSeconds = seconds%60;
		
		int s = (int)newSeconds;
		
		System.out.println(h);
		
		System.out.println(m);
		
		System.out.println(s);
		
		System.out.println(h + ":" + m + ":" + s);

	}

}

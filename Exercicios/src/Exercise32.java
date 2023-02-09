import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the first integer: ");
		
		int x = sc.nextInt();
		
		System.out.println("Input the second integer: ");
		
		int y = sc.nextInt();
		
		if (x == y)
			System.out.printf("%d == %d\n", x , y);
		if (x != y)
			System.out.printf("%d != %d\n", x , y);
		if (x < y)
			System.out.printf("%d < %d\n", x , y);
		if (x > y)
			System.out.printf("%d > %d\n", x , y);
		if (x <= y)
			System.out.printf("%d <= %d\n", x , y);
		if (x >= y)
			System.out.printf("%d >= %d\n", x , y);
		}
	
	}
	
	


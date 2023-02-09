import java.util.Scanner;

public class Exercise11 {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Radius: ");
	
	double r = sc.nextDouble();
	
	System.out.println("Perimeter is: " + (2*3.14*r));
	System.out.println("Area is: " + (3.14*(r*r)));
	}

}

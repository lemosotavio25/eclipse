import java.util.Arrays;

public class Exercise83 {
	public static void main(String[] args) {
		String result = "";
		int[] vetor_1 = {1, 3, -5, 4};
		int[] vetor_2 = {1, 4, -5, -2};
				
		System.out.println("\nArray1:" + Arrays.toString(vetor_1));
		System.out.println("\nArray2:" + Arrays.toString(vetor_2));
		
		// -> variavel = 0, condição, ação.;
		
		for (int i = 0; i < vetor_2.length; i = i++) {
			int num1 = vetor_2[i];
			int num2 = vetor_1[i];
			result += Integer.toString(num1 * num2) + " ";
	
		}
		
		
	System.out.println("\nResult: " + result);	
	
	}
	}
	
	


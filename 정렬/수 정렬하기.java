import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] intArray = new int[n]; 
		for(int i=0; i<n; i++) {
			intArray[i] = sc.nextInt();
		}
		// sorting using brute force O(n^2)
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(intArray[j+1] < intArray[j]) {
					int x = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = x;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(intArray[i]);
		}
	}
}

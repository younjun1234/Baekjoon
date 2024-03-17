import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] intArray = new int[n]; 
		int sum = 0;
		for(int i=0; i<n; i++) {
			intArray[i] = sc.nextInt();
		}
		// brute force
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(intArray[j+1] > intArray[j]) {
					int cont = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = cont;
				}
			}
		}
		
		System.out.println(intArray[x-1]);
	}
}

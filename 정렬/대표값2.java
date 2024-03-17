import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5]; 
		int sum = 0;
		for(int i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
		}
		// sort using brute force
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(intArray[j+1] < intArray[j]) {
					int x = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = x;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			sum += intArray[i];
		}
		System.out.println(sum / 5);
		System.out.println(intArray[2]);
	}
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int min = -1;
		int sum = 0;
		for(int i=m; i <= n; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(i == 1) {
				isPrime = false;
			}
			
			if(isPrime) {
				if(min == -1) {
					min = i;
				}
				sum += i;
			}
		}
		if( min != -1) {
			System.out.println(sum);
		}
		System.out.println(min);
	}
}

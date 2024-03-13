import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		for(int i=0; i < n; i++) {
			int primeCk = sc.nextInt();
			boolean isPrime = true;
			for(int j=2; j<primeCk; j++) {
				if(primeCk % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(primeCk == 1) {
				isPrime = false;
			}
			if(isPrime) {
				count++;
			}
		}
		System.out.println(count);
	}
}

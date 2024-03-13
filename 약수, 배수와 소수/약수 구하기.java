import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int divisor = 1;
		while(true) {
			if (n % divisor == 0) {
				if(k == 1) {
					System.out.println(divisor);
					break;
				}
				k--;
			}
			if (divisor > n) {
				System.out.println(0);
				break;
			}
			divisor++;
				
		}
	}
}

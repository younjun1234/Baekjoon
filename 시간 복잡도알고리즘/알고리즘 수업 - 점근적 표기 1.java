import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		
		int c = sc.nextInt();
		
		int n0 = sc.nextInt();
		
		// a1 * n0 + a0 <= c n0
		if (a1 - c > 0) {
			System.out.println(0);
		} else {
			if(a0 < 0) {
				System.out.println(1);
			} else {
				if((a1-c) * n0 + a0 <= 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		}
	}
}

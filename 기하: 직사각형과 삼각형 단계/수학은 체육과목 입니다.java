import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		// 3 + n + (n - 1) * 3
		
		System.out.println(3 + n + (n - 1) * 3);
	}
}

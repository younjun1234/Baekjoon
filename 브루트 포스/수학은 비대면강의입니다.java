import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// input
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = sc.nextInt();
		long d = sc.nextInt();
		long e = sc.nextInt();
		long f = sc.nextInt();
		//brute force = 무식하게 풀기 머리 쓰지 말기
		for(int x=-999; x<1000; x++) {
			for(int y=-999; y<1000; y++) {
				if(a * x + b * y == c && d * x + e * y == f) {
					System.out.println(x + " " + y);
				}
			}
		}
	}
}

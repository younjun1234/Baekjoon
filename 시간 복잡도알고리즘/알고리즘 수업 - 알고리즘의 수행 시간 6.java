import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		System.out.println(x * (x - 1) * (x - 2) / 6);
		System.out.println(3);
	}
}

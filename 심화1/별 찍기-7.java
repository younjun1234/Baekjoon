import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.println(" ".repeat(num - i) + "*".repeat(i * 2 - 1));
		}
		for (int i = num-1; i > 0; i--) {
			System.out.println(" ".repeat(num - i) + "*".repeat(i * 2 - 1));

		}
	}
}

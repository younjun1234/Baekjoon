import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 1;
		int num = 1;
		while (n > num) {
			num += count * 6;
			count ++;
		}
		System.out.println(count);
	}
}

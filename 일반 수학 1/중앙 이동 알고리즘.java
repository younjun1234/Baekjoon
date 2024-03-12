import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		int dots = 2;
		for(int i=0; i<n; i++) {
			dots += (int)Math.pow(2, i);
		}
		
		System.out.println(dots * dots);
	}
}

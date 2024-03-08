
import java.util.Scanner;

public class BM1_11005 {

	public static void main(String[] args) {
		String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int b = Integer.parseInt(input.split(" ")[1]);
		
		String answer = "";
		while(n > 0) {
			int mod = n % b;
			n /= b;
			answer = code.charAt(mod) + answer;
		}
		System.out.println(answer);
	}
	
	
}

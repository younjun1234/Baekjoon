
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int answer = -1;
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String num = "" + i;
			int sum = i;
			for(int j=0; j<num.length(); j++) {
				int x = (int)num.charAt(j);
				sum += x - 48;
			}
			if(sum == n) {
				answer = i;
				break;
			}
		}
		
		if(answer != -1) {
			System.out.println(answer);
		} else {
			System.out.println(0);
		}
	}
}

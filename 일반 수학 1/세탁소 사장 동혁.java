import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int[] coins = {25, 10, 5, 1};
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<t; i++) {
			int change = Integer.parseInt(sc.nextLine());
			String answer = "";
			for(int j=0; j<4; j++) {
				answer += change / coins[j] + " ";
				change %= coins[j];
			}
			System.out.println(answer);
 		}
	}
}

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		while(n != -1) {
			int divisorSum = 1;
			StringBuilder sb = new StringBuilder();
			sb.append(n + " = 1");
			for(int i=2; i<n; i++) {
				if(n % i == 0) {
					divisorSum += i;
					sb.append(" + " + i);
				}
			}
			if (divisorSum != n) {
				System.out.println(n + " is NOT perfect.");
			} else {
				System.out.println(sb.toString());
			}
			n = sc.nextInt();
			
		}
	}
}

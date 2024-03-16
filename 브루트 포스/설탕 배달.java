
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int min = n / 3 + 1;
		for(int i=min; i>=0; i--) {
			
			int fiveCount = 0;
			int check = 0;
			while(true) {
				check = fiveCount * 5 + i * 3;
				if(check == n) {
					if (fiveCount + i < min) {
						min = fiveCount + i;
					}
					break;
				} else if (check > n ) {
					break;
				} else {
					fiveCount++;
				}
			}
		}
		if(min == n/3 + 1) {
			System.out.println(-1);
		} else {
			System.out.println(min);
		}
	}
}

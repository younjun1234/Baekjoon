
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		char[][] input = new char[n][m];
		for(int i=0; i < n; i++) {
			input[i] = sc.nextLine().toCharArray();
		}
		
		int min = 64;
		
		for(int i=0; i <= n-8; i++) {
			for(int j=0; j<= m-8; j++) {
				char whiteStart = 'W';
				char blackStart = 'B';
				int whiteStartChange = 0;
				int blackStartChange = 0;
				for(int x=0; x < 8; x++) {
					for(int y=0; y < 8; y++) {
						if(input[x+i][y + j] != whiteStart) {
							whiteStartChange++;
						}
						if(input[x+i][y + j] != blackStart) {
							blackStartChange++;
						}
						if (whiteStart == 'B') {
							whiteStart = 'W';
							blackStart = 'B';
						} else {
							whiteStart = 'B';
							blackStart = 'W';
						}
					}
					if (whiteStart == 'B') {
						whiteStart = 'W';
						blackStart = 'B';
					} else {
						whiteStart = 'B';
						blackStart = 'W';
					}
				}
				if (whiteStartChange < min) {
					min = whiteStartChange;
				}
				if (blackStartChange < min) {
					min = blackStartChange;
				}
			}
		}
		System.out.println(min);
	}
}

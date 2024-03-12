import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		
		int count = 1;
		int lineNum = 1;
		while(true) {
			if (count + lineNum + 1 < x) {
				lineNum++;
				count += lineNum;
			} else {
				break;
			}
		}
		
		if(x != 1) {
			lineNum += 1;
		}
		
		int n = x - count;
		if(x == 1) {
			System.out.println("1/1");
		} else {
			if (lineNum % 2 == 0) {
				System.out.println(n + "/" + (lineNum - (n - 1)));
			} else {
				System.out.println((lineNum - (n - 1)) + "/" + (n));
			}
		}
	}
}

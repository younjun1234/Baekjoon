import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int count = 0;
		int num = 665;
		while(true) {
			num++;
			String sNum = "" + num;
			for(int i=0; i<=sNum.length()-3; i++) {
				if(sNum.charAt(i) == '6' && sNum.charAt(i+1) == '6' && sNum.charAt(i+2) == '6') {
					count++;
					break;
				}
			}
			if(count == x) {
				break;
			}
		}
		System.out.println(num);
	}
}

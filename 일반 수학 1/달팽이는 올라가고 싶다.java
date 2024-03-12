import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int a = Integer.parseInt(line.split(" ")[0]);
		int b = Integer.parseInt(line.split(" ")[1]);
		int v = Integer.parseInt(line.split(" ")[2]);
		
		int addition = a - b;
		int max = a;
		// a = 100;
		// b = 99;
		// 100 101 102
		// 100 + (a - b) * days;
		
		// a = 2;
		// b = 1;
		// 2 3 4 5;
		// 2 + (a - b) * days;
		
		// a = 5;
		// b = 1;
		// 5 9
		// 5 + (a - b) * days
		int days = 0;
		if((v-a)%addition==0) {
			days = (v - a)/addition + 1;
		} else {
			days = (v - a)/addition + 2;
		}
		
		
		System.out.println(days);
	}
	
}

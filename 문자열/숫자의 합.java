import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.nextLine());
		String number = sc.nextLine();
		int sum = 0;
		for(int i= 0; i < s; i++) {
			sum += (int)number.charAt(i) - 48;
		}
        System.out.println(sum);
	}
}

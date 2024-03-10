import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for(int i = 97; i <= 122; i++) {
			System.out.print(input.indexOf((char)i) + " ");
			
		}
	}
}

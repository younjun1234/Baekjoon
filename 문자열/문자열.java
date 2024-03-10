import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.nextLine());
		for(int i= 0; i < s; i ++) {
			String input = sc.nextLine();
			System.out.println(String.format("%c%c", input.charAt(0), input.charAt(input.length()-1)));
			
		}
		
	}
}

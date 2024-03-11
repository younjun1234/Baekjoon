import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String firstHalf = "";
		String secondHalf = "";
		for(int i = 0; i < input.length() / 2; i++) {
			firstHalf += input.charAt(i);
		}
		int oddOrEven = input.length() % 2 == 0 ? input.length() / 2 - 1: input.length() / 2 ;
		for(int i = input.length()-1; i > oddOrEven; i--) {
			secondHalf += input.charAt(i);
		}
		
		System.out.println(firstHalf.equals(secondHalf) ? 1 : 0);
	}
}

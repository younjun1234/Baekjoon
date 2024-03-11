import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("c=", " ");
		input = input.replaceAll("c-", " ");
		input = input.replaceAll("dz=", " ");
		input = input.replaceAll("d-", " ");
		input = input.replaceAll("lj", " ");
		input = input.replaceAll("nj", " ");
		input = input.replaceAll("s=", " ");
		input = input.replaceAll("z=", " ");
		System.out.println(input.length());
	}
	
	
}
	

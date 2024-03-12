import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[15];
		for(int i=0; i<15; i++) {
			arr[i] = "";
		}
		
		
		for (int i=0; i<5; i++) {
			String line = sc.nextLine();
			for (int j=0; j<line.length(); j++) {
				arr[j] = arr[j] + line.charAt(j);
			}
		}
		
		String output = "";
		for(int i=0; i<15; i++) {
			output += arr[i];
		}
		
		System.out.println(output);
	}
}

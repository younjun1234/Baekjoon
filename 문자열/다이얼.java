import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int time = input.length() * 2;
		for (int i=0; i < input.length(); i++) {
			switch(input.charAt(i)) {
			case 'A': case 'B' : case 'C':
				time += 1; break;
			case 'F': case 'D' : case 'E':
				time += 2; break;
			case 'G': case 'H' : case 'I':
				time += 3; break;
			case 'J': case 'K' : case 'L':
				time += 4; break;
			case 'M': case 'N' : case 'O':
				time += 5; break;
			case 'P': case 'Q' : case 'R': case 'S':
				time += 6; break;
			case 'T': case 'U' : case 'V':
				time += 7; break;
			case 'W': case 'X' : case 'Y': case 'Z':
				time += 8; break;
			}
		}
		System.out.println(time);
		
	}
}

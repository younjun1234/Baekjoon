import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String code = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int answer = 0; 
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String n = input.split(" ")[0];
		int b = Integer.parseInt(input.split(" ")[1]);
		
		int power = 0;
		for(int i=n.length()-1; i >= 0; i--) {
			
			// 해당 위치에 있는 문자
			char c = n.charAt(i);
			
			// 해당 문자의 10진수 값
			int dec = code.indexOf(c);
			
			answer += dec * Math.pow(b, power++);
			
		}
		
		System.out.println((int)answer);
	}
	
}

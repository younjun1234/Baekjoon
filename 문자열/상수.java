import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String aReverse = "";
		String bReverse = "";
		for(int i=2; i>=0; i--) {
			aReverse += a.charAt(i);
			bReverse += b.charAt(i);
		}
		System.out.println(Integer.parseInt(aReverse) > Integer.parseInt(bReverse) ? aReverse : bReverse);
	}
}

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int max = 0;
		int notMax = 0;
		if(x >= y && x >= z) {
			max = x;
			notMax = y+z;
		} else if(y >= x && y >= z) {
			max = y;
			notMax = x+z;
		} else if(z >= y && z >= x) {
			max = z;
			notMax = y+x;
		}
		
		if(max >= notMax) {
			System.out.println(notMax * 2 - 1);
		} else {
			System.out.println(max + notMax);
		}
	}
}

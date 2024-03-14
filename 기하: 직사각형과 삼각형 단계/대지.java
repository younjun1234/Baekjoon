import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		int xMax = 0;
		int xMin = 0;
		int yMax = 0;
		int yMin = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		xMax = x;
		xMin = x;
		yMax = y;
		yMin = y;
		
		for(int i=1; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (xMax < x) {
				xMax = x;
			} else if (xMin > x) {
				xMin = x;
			}
			
			if (yMax < y) {
				yMax = y;
			} else if (yMin > y) {
				yMin = y;
			}
		}
		
		System.out.println((xMax - xMin) * (yMax - yMin));
	}
}

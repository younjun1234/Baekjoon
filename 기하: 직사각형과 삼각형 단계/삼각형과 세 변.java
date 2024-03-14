import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		while(x != 0 && y != 0 && z != 0) {
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
				System.out.println("Invalid");
			} else {
				if(x==y && y==z) {
					System.out.println("Equilateral");
				} else if(x==y || y==z || z==x) {
					System.out.println("Isosceles");
				} else {
					System.out.println("Scalene");
				}
			}
			
			
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		}
	}
}

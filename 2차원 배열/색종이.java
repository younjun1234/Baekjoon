import java.util.Scanner;

// 색종이
public class Main {
	
	public static void main(String[] args) {
		int answer = 0; 
		
		int[][] arr = new int[100][100];
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int x;
		int y;
		for(int i = 0; i < num; i ++) {
			
			String line = sc.nextLine();
			x = Integer.parseInt(line.split(" ")[0]);
			y = Integer.parseInt(line.split(" ")[1]);
			
			for (int j=x; j<x+10; j++) {
				for (int k=y; k<y+10; k++) {
					if(arr[j][k] == 0) {
						answer++;
						arr[j][k] = 1;
					}
				}
			}
		}
		
		System.out.println(answer);
		
	}
}

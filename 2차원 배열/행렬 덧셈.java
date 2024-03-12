import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rowColumn = sc.nextLine();
		int rows = Integer.parseInt(rowColumn.split(" ")[0]);
		int columns = Integer.parseInt(rowColumn.split(" ")[1]);
		
		int[][] arrA = new int[rows][columns];
		int[][] arrB = new int[rows][columns];
		
		for (int i=0; i<rows; i++) {
			String[] row = sc.nextLine().split(" ");
			for(int j=0; j<columns; j++) {
				arrA[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		for (int i=0; i<rows; i++) {
			String[] row = sc.nextLine().split(" ");
			for(int j=0; j<columns; j++) {
				arrB[i][j] = Integer.parseInt(row[j]);
			}
		}
		
		String output = "";
		for (int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				output += (arrA[i][j] + arrB[i][j]) + " ";
			}
			output += "\n";
		}
		System.out.println(output);
	}
}

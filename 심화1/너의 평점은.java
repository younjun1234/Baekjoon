import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0;
		double gpaSum = 0;
		
		for(int i=0; i<20; i++) {
			String input = sc.nextLine();
			double gpa = Double.parseDouble(input.split(" ")[1]);
			String grade = input.split(" ")[2];
			double gradeScore = 0.0;
			
			switch(grade) {
			case "A+": 
				sum += (gpa * 4.5);
				gpaSum += gpa;
				break;
			case "A0": 
				sum += (gpa * 4);
				gpaSum += gpa;
				break;
			case "B+": 
				sum += (gpa * 3.5); 
				gpaSum += gpa;
				break;
			case "B0": 
				sum += (gpa * 3);
				gpaSum += gpa;
				break;
			case "C+": 
				sum += (gpa * 2.5); 
				gpaSum += gpa;
				break;
			case "C0": 
				sum += (gpa * 2);
				gpaSum += gpa;
				break;
			case "D+": 
				sum += (gpa * 1.5);
				gpaSum += gpa;
				break;
			case "D0": 
				sum += (gpa * 1); 
				gpaSum += gpa;
				break;
			case "F":
				gpaSum += gpa;
				break;
			}
		}
		System.out.println(sum/gpaSum);
	}
}

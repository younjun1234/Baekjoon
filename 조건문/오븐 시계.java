import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		sc.close();
		
		minute += (time % 60);
		hour += (time / 60);
		if (minute >= 60) {
			minute -= 60;
            hour++;
		} 
		
		if (hour >= 24) {
			hour -= 24;
					
		}
		System.out.println(hour + " " + minute);
	}
}

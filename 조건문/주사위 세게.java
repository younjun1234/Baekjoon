import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dice1 = sc.nextInt();
		int dice2 = sc.nextInt();
		int dice3 = sc.nextInt();
		sc.close();
		int noOfSameDice = 1;
		int sameDice = 0;
		int highestDice = dice1;
		
		if (dice1 == dice2) {
			noOfSameDice++;
			sameDice = dice1;
		}
		if (dice1 == dice3) {
			sameDice = dice1;
			noOfSameDice++;
		}
		if (dice2 == dice3) {
			sameDice = dice2;
			noOfSameDice++;
		}
		
		
		if (noOfSameDice == 1) {
			if (dice2 > highestDice) {
				highestDice = dice2;
			}
			if (dice3 > highestDice) {
				highestDice = dice3;
			}
			System.out.println(highestDice * 100);
		} else if (noOfSameDice == 2) {
			System.out.println(1000 + sameDice * 100);
		} else {
			System.out.println(10000 + sameDice * 1000);			
		}
			
		
	}
}

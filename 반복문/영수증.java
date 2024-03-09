import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int price = sc.nextInt();
		int items = sc.nextInt();
		int totalPrice = 0;
		
		for (int i = 0; i < items; i++) {
			int itemPrice = sc.nextInt();
			int itemQuantity = sc.nextInt();
			totalPrice += (itemPrice * itemQuantity);
		}
		if (price == totalPrice) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

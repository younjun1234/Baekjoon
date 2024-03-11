import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i < n; i++) {
			
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			boolean groupWord = true;
			String input = sc.nextLine();
			map.put(input.charAt(0), 1);
			
			for (int j=1; j < input.length(); j++) {
				if (map.containsKey(input.charAt(j))){
					if (input.charAt(j-1) != input.charAt(j)) {
						groupWord = false;
					}
				} else {
					map.put(input.charAt(j), 1);
				}
			}
			if (groupWord) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}

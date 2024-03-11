import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toUpperCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		// 
		for(int i=0; i < input.length(); i++) {
			char alphabet = input.charAt(i);
			if(map.containsKey(alphabet)) {
				map.replace(alphabet, map.get(alphabet) + 1);
			} else {
				map.put(alphabet, 1);
			}
		}
		int maxValue = Collections.max(map.values());
		
		String maxChar = "";
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == maxValue) {
				maxChar += entry.getKey();
			}
		}
		
		if(maxChar.length() > 1) {
			System.out.println("?");
			return;
		} else {
			System.out.println(maxChar);
		}
	}
}

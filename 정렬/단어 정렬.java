import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine();
		}
		
		Arrays.sort(arr, (s1, s2) -> {
			if(s1.length() == s2.length()) {
				return s1.compareTo(s2);
			} else {
				return s1.length() - s2.length();
			}
		});
		
		for(int i=0; i<n; i++) {
			if(i != 0) {
				if(!arr[i].equals(arr[i-1])) {
					sb.append(arr[i] + "\n");
				}
			} else {
				sb.append(arr[i] + "\n");
			}
		}
		
		
		bw.write(sb.toString());
		bw.flush();
		
	}
}

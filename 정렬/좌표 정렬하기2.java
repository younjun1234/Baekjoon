import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Integer[][] arr = new Integer[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (n1, n2) -> {
			if(n1[1].equals(n2[1])) {
				return n1[0] - n2[0];
			} else {
				return n1[1] - n2[1];
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		
	}

}

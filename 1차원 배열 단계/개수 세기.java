import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int count = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int c = Integer.parseInt(st.nextToken());
			if (c == v) {
				count++;
			}
		}
		bw.write(count + "\n");
		bw.close();
		
	}
}

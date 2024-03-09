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
		int max = 0;
		int position = 0;
		
		for (int i = 1; i <= 9 ; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num > max) {
				max = num;
				position = i;
			}
		}
		bw.write(String.format("%d\n%d\n", max, position));
		bw.close();
		
	}
}

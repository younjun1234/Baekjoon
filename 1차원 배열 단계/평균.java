import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int m = Integer.parseInt(br.readLine());
		double[] scoreArr = new double[m];
		st = new StringTokenizer(br.readLine());
		double max = 0;
		double sum = 0;
		
		for(int i=0; i < m; i++) {
			int score = Integer.parseInt(st.nextToken());
			if(score > max) {
				max = score;
			}
			scoreArr[i] = score;
		}
		
		for(int i=0; i < m; i++) {
			scoreArr[i] = scoreArr[i] / max * 100;
			sum += scoreArr[i];
		}

		System.out.println(sum/m);
	}
}

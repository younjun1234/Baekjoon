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
		StringTokenizer st;
		int store;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] output = new int[N];
		for (int i=0; i<N; i++) {
			output[i] = i+1;
		}
		
		for (int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int front = Integer.parseInt(st.nextToken())-1;
			int back = Integer.parseInt(st.nextToken())-1;
			store = output[front];
			output[front] = output[back];
			output[back] = store;
			}
		bw.write(Arrays.toString(output).replaceAll("[^0-9 ]", ""));
		bw.close();
		
	}
}

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
		int[] output = new int[2];
		int[] input = new int[28];
		int found = 0;
		
		for (int i=0; i<28; i++) {
			input[i] = Integer.parseInt(br.readLine());			
		}
		
		
		for (int i=1; i<=30; i++) {
			boolean doesExist = false;
			for (int j=0; j<28; j++) {
				if (i==input[j]) {
					doesExist = true;
					break;
				}
			}
			if (doesExist == false) {
				output[found] = i;
				found += 1;
			}
		}
		Arrays.sort(output);
		for (int i : output) {
			bw.write(i + "\n");
		}
		
		bw.close();
		
	}
}

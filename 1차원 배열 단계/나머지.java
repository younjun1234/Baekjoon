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
		int[] output = new int[10];
		int count = 0;
		int n;
		
		for (int i=0; i<10; i++) {
			n = Integer.parseInt(br.readLine());
			output[i] = n % 42;
		}	
	
		count = (int) Arrays.stream(output).distinct().count();
				
		System.out.println(count);
		
		bw.close();
		
	}
}

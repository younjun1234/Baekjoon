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
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[] intArr = new int[n];
		for(int i=0;i < n; i++) {
			intArr[i] = i+1;
		}
		
		for(int k=0; k < m; k++) {
			int[] copyArr = Arrays.copyOf(intArr, n);
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			for(int l=i; l<=j; l++) {
				copyArr[l] = intArr[j - l + i];
			}
			intArr = copyArr;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(intArr[i] +  " ");
		}
		
		
	}
}

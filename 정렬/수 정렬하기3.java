import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
  // counting sort O(n + k)
	public static void main(String[] args) throws IOException{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int intArr[] = new int[n];
        for(int i=0; i<n; i++) {
        	intArr[i] = Integer.parseInt(br.readLine());
        	if(intArr[i] > max) {
        		max = intArr[i];
        	}
        }
        
        int countArr[] = new int[max];
        for(int i=0; i<n; i++) {
        	countArr[intArr[i]-1] += 1;
        }
        
        for(int i=1; i<max; i++) {
        	countArr[i] = countArr[i] + countArr[i - 1];
        }
        
        int result[] = new int[n];
        for(int i=0; i<n; i++) {
        	result[countArr[intArr[i]-1] - 1] = intArr[i];
        	countArr[intArr[i]-1] -= 1;
        }

        for(int i=0; i<n; i++) {
        	bw.write(result[i] + "\n");
        }
        bw.flush();
	}
}

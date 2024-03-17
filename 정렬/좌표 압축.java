import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

  // quick sort + binary search
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        String xi = br.readLine();
        StringTokenizer st = new StringTokenizer(xi);
        Integer[] arr = new Integer[n];
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<n; i++) {
        	int token = Integer.parseInt(st.nextToken());
        	arr[i] = token;
        	set.add(token);
        }
        
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        
        for(int i=0; i<n; i++) {
        	sb.append(binarySearch(list, arr[i], 0, list.size()-1) + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        
	}
	
	public static int binarySearch(List<Integer> list, int target, int low, int high) {
		if(low <= high) {
			int middle = (high + low) / 2;
			if(list.get(middle) == target) {
				return middle;
			} else if(list.get(middle) > target) {
				return binarySearch(list, target, low, middle-1);
			} else {
				return binarySearch(list, target, middle+1, high);
			}
		} else {
			return -1;
		}
		
			
	}
}

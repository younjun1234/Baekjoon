import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	private static String[][] storeArr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][2];
		storeArr = new String[n][2];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
		}
		
		mergeSort(arr, 0, arr.length-1);
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}
	
	public static void merge(String[][] list, int start, int middle, int end) {
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while(i <= middle && j <= end) {
			if(Integer.parseInt(list[i][0]) <= Integer.parseInt(list[j][0])) {
				storeArr[k] = list[i];
				i++;
			} else {
				storeArr[k] = list[j];
				j++;
			}
			k++;
		}
		
		if(i > middle) {
			for(int t=j; t<=end; t++) {
				storeArr[k] = list[t];
				k++;
			}
		} else {
			for(int t=i; t<=middle; t++) {
				storeArr[k] = list[t];
				k++;
			}
		}
		
		for(int t=start; t<=end; t++) {
			list[t] = storeArr[t];
		}
	}
	
	public static void mergeSort(String[][] list, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(list, start, middle);
			mergeSort(list, middle+1, end);
			merge(list, start, middle, end);
		}
	}
}

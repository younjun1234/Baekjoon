import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;

public class Main {

	private static int[] storeArr;
	// merge sort
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		String n = br.readLine();
		int[] arr = new int[n.length()];
		storeArr = new int[n.length()];
		
		for(int i=0; i<n.length(); i++) {
			arr[i] = n.charAt(i) - 48;
		}
		
		mergeSort(arr, 0, n.length()-1);
		
		for(int i=n.length()-1; i>=0; i--) {
			sb.append(arr[i]);
		}
		bw.write(sb.toString());
		bw.flush();
		
	}
	
	public static void merge(int[] list, int start, int middle, int end) {
		int i = start;
		int j = middle + 1;
		int k = start;
		
		while(i <= middle && j <= end) {
			if(list[i] <= list[j]) {
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
	
	public static void mergeSort(int[] list, int start, int end) {
		if(start < end) {
			int middle = (start + end) / 2;
			mergeSort(list, start, middle);
			mergeSort(list, middle+1, end);
			merge(list, start, middle, end);
		}
	}
}

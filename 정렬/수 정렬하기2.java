import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	private static int[] intArray;

  // divide and conquer (merge sort) O(n log n)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] finalArray = new int[n];
		intArray = new int[n];
		for(int i=0; i < n; i++) {
			finalArray[i] = Integer.parseInt(br.readLine());
		}
		mergeSort(finalArray, 0, n-1);
		
		for(int i=0; i<n; i++) {
			bw.write(finalArray[i] + "\n");
		}
		bw.flush();
        
		//실험할 코드 추가
		        
	}
	
	// 병합
	public static void merge(int[] list, int left, int middle, int right) {
		int i = left;
		int j = middle + 1;
		int k = left;
		
		while(i <= middle && j <= right) {
			if(list[i] <= list[j]) {
				intArray[k] = list[i];
				i++;
			} else {
				intArray[k] = list[j];
				j++;
			}
			k++;
		}
		if(i > middle) {
			for(int t = j; t <= right; t++) {
				intArray[k] = list[t];
				k++;
			}
		} else {
			for(int t = i; t <= middle; t++) {
				intArray[k] = list[t];
				k++;
			}
		}
		
		for(int t = left; t <= right; t++) {
			list[t] = intArray[t];
		}
	}
	
	//재귀 함수를 통한 나누기
	public static void mergeSort(int[] list, int left, int right) {
		if(left < right) {
			int middle = (left + right) / 2;
			mergeSort(list, left, middle);
			mergeSort(list, middle+1, right);
			merge(list, left, middle, right);
		}
	}
}

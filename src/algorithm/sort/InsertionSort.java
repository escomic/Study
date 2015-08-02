package algorithm.sort;

/**
 *  best : O(n)
 *  average : O(n^2)
 *  worst : O(n^2)
 */
public class InsertionSort {

	public static int[] sort(int[] data) {
		int size = data.length;
		int temp;
		int index;
		
		for (int i = 1; i < size; i++) {
			temp = data[i];
			index = i - 1;
			
			while((index >= 0) && (data[index] > temp)) {
				data[index+1] = data[index];
				index--;
			}
			
			data[index + 1] = temp;
		}
		
		return data;
	}
	
	public static void main(String[] args) {
		int[] data = { 10, 34, 3, 456, 23, 31 };
		Utils.print("before", data);
		sort(data);
		Utils.print("after", data);
	}
}

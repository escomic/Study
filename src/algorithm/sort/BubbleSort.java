package algorithm.sort;

/**
 *  best : O(n)
 *  average : O(n^2)
 *  worst : O(n^2)
 */
public class BubbleSort {

	public int[] sort(int[] data) {
		int size = data.length;
		int temp;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - (i + 1); j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}

	public static void main(String[] args) {
		int[] data = { 10, 34, 3, 456, 23, 31 };
		Utils.print("before", data);
		BubbleSort sort = new BubbleSort();
		sort.sort(data);
		Utils.print("after", data);
	}
	
}

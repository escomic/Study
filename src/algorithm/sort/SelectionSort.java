package algorithm.sort;

/**
 *  best : O(n^2)
 *  average : O(n^2)
 *  worst : O(n^2)
 */
public class SelectionSort {

	public static int[] sort(int[] data) {
		int size = data.length;
		int minValue;
		int minIndex;

		for (int i = 0; i < size - 1; i++) {
			minValue = data[i];
			minIndex = i;

			for (int j = i; j < size - 1; j++) {
				if (minValue > data[j + 1]) {
					minValue = data[j + 1];
					minIndex = j + 1;
				}
			}

			data[minIndex] = data[i];
			data[i] = minValue;
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

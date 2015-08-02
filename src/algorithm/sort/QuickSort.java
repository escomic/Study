package algorithm.sort;

/**
 *  best : O(n log n)
 *  average : O(n log n)
 *  worst : O(n^2)
 */
public class QuickSort {

	public static int[] sort(int[] data) {
		int left = 0;
		int right = data.length - 1;
		data = quickSort(data, left, right);
		return data;
	}

	public static int[] quickSort(int data[], int left, int right) {
		int index = partition(data, left, right);
		if (left < index - 1) {
			quickSort(data, left, index - 1);
		}
		if (index < right) {
			quickSort(data, index, right);
		}
		return data;
	}

	public static int partition(int data[], int left, int right) {
		int pivot = data[(left + right) / 2];

		while (left <= right) {
			while (data[left] < pivot) {
				left++;
			}
			while (data[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		}

		return left;
	}

	public static void main(String[] args) {
		int[] data = { 10, 34, 3, 456, 23, 31 };
		Utils.print("before", data);
		sort(data);
		Utils.print("after", data);
	}

}

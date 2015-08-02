package algorithm.search;

/**
 * 오름차순으로 정렬된 리스트에서 특정한 값의 위치를 찾는 알고리즘이다. 
 * 처음 중간의 값을 임의의 값으로 선택하여, 
 * 그 값과 찾고자 하는 값의 크고 작음을 비교하는 방식을 채택하고 있다. 
 * 처음 선택한 중앙값이 만약 찾는 값보다 크면 그 값은 새로운 최고값이 되며, 
 * 작으면 그 값은 새로운 최하값이 된다. 
 * 검색 원리상 정렬된 리스트에만 사용할 수 있다는 단점이 있지만, 
 * 검색이 반복될 때마다 목표값을 찾을 확률은 두 배가 되므로 속도가 빠르다는 장점이 있다. 
 * 
 * O(log(n))
 */
public class BinarySearch {

	public static int search(int[] data, int value, int low, int high) {
		if (high < low) {
			return -1; // not found
		}

		int mid = (low + high) / 2;
		if (data[mid] > value) {
			return search(data, value, low, mid - 1);
		} else if (data[mid] < value) {
			return search(data, value, mid + 1, high);
		} else {
			return mid; // found
		}
	}
	
	public static void main(String[] args) {
		int[] data = {0, 13, 25, 33, 45, 53, 67, 83, 91};
		int value = 45;
		
		int index = search(data, value, 0, data.length -1);
		System.out.println("found : " + index);
	}
}

package task1;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public int recursiveLinearSearch(int target, int index) {
		if (index == array.length) {
			return -1;
		} else if (array[index] == target) {
			return index;
		} else {
			return recursiveLinearSearch(target, index + 1);
		}
	}

	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearch(target, 0);
	}

	public int iterativeBinarySearch(int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int center = (low + high) / 2;
			if (target == array[center]) {
				return center;
			} else if (target < array[center]) {
				high = center - 1;
			} else {
				low = center + 1;
			}
		}
		return -1;

	}

	public int recursiveBinarySearch(int target, int low, int high) {
		if (low > high) {
			return -1;
		}
		int center = (low + high) / 2;
		if (array[center] == target) {
			return center;
		} else if (target < array[center]) {
			return recursiveBinarySearch(target, low, center - 1);
		} else {
			return recursiveBinarySearch(target, center + 1, high);
		}

	}

	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearch(target, 0, array.length - 1);
	}

	public static void main(String[] args) {
		int[] arr1 = { 12, 10, 9, 45, 2, 10, 10, 45 };

		MyArray myArr1 = new MyArray(arr1);

		System.out.println(myArr1.iterativeLinearSearch(45));
		System.out.println(myArr1.recursiveLinearSearch(45));

		System.out.println(myArr1.iterativeBinarySearch(45));
		System.out.println(myArr1.iterativeBinarySearch(45));

		System.out.println(myArr1.recursiveBinarySearch(45));
		System.out.println(myArr1.recursiveBinarySearch(10));
		System.out.println(myArr1.recursiveBinarySearch(9));
		System.out.println(myArr1.recursiveBinarySearch(89));
	}
}

package sample.sorting;

public class InsertionSort extends AbstractSort implements ISort {

	@Override
	public int[] sort(int[] array) {
		int tmp;
		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] > array[index + 1]) {
				for (int i = index + 1; array[i] < array[i-1] && i > 0; i--) {
					tmp = array[i-1];
					array[i-1] = array[i];
					array[i] = tmp;
				}
			}
		}
		
		return array;
	}

}

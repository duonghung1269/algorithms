package sample.sorting;

public class SelectionSort extends AbstractSort implements ISort {

	@Override
	public int[] sort(int[] array) {
		int index;
		int tmp;
		for (int outerIndex = array.length - 1; outerIndex > 1; outerIndex--) {
			index = 0;
			for (int innerIndex = 1; innerIndex < outerIndex; innerIndex++) {
				if (array[innerIndex] > array[index]) {
					index = innerIndex;
				}
			}
			
			tmp = array[outerIndex];
			array[outerIndex] = array[index];
			array[index] = tmp;
		}
		
		return array;
	}

}

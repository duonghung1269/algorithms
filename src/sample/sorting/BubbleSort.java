package sample.sorting;

public class BubbleSort extends AbstractSort implements ISort {
	
	public int[] sort(int[] array) {
		int sorted = 0;
		for (int i = 0; i < array.length - sorted; i++) {
			for (int j = 0; j <= array.length - sorted - 2; j++) {
				if (array[j] > array[j+1]) {
					int tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
				}
			}
			sorted++;
		}
		return array;
	}
	
}

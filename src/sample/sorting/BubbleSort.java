package sample.sorting;

/**
 * 
 * https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif
 * @author SGSCDHDX
 *
 */
public class BubbleSort extends AbstractSort implements ISort {
	
	public int[] sort(int[] array) {
		int sorted = 0;
		for (int i = 0; i < array.length - sorted; i++) {
			for (int j = 0; j <= array.length - sorted - 2; j++) {
				if (array[j] > array[j+1]) {
					swap(array, j, j + 1);
				}
			}
			sorted++;
		}
		return array;
	}
	
}

package sample.sorting;

/**
 * Idea of selection sort as this example below:
 * 
 * 64 25 12 22 11 // this is the initial, starting state of the array
 * 11 25 12 22 64 // sorted sublist = {11}
 * 11 12 25 22 64 // sorted sublist = {11, 12}
 * 11 12 22 25 64 // sorted sublist = {11, 12, 22}
 * 11 12 22 25 64 // sorted sublist = {11, 12, 22, 25}
 * 11 12 22 25 64 // sorted sublist = {11, 12, 22, 25, 64}
 * 
 * https://en.wikipedia.org/wiki/File:Selection-Sort-Animation.gif
 * @author SGSCDHDX
 *
 */
public class SelectionSort extends AbstractSort implements ISort {

	@Override
	public int[] sort(int[] array) {
		int minIndex;
		for (int outerIndex = 0; outerIndex < array.length - 1; outerIndex++) {
			/* find the min element in the unsorted array[outerIndex .. length-1] */
			minIndex = outerIndex;
			
			// test against elements after outerIndex to find the smallest 
			for (int innerIndex = outerIndex + 1; innerIndex < array.length; innerIndex++) {
				if (array[innerIndex] < array[minIndex]) {
					minIndex = innerIndex;
				}
			}
			
			if (outerIndex != minIndex) {
				swap(array, outerIndex, minIndex);
			}
		}
		
		return array;
	}

}

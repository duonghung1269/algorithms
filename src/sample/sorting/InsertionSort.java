package sample.sorting;

/**
 * https://en.wikipedia.org/wiki/File:Insertion-sort-example-300px.gif
 * @author SGSCDHDX
 *
 */
public class InsertionSort extends AbstractSort implements ISort {

	@Override
	public int[] sort(int[] array) {
		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] <= array[index + 1]) {
				continue;
			}
			
			int unsortedIndex = index + 1;
			int unsortedValue = array[unsortedIndex];
			while (unsortedIndex > 0 && unsortedValue < array[unsortedIndex-1]) {
				// original using swap, but can try faster one with shift
				//swap(array, unsortedIndex, unsortedIndex - 1);
				
				array[unsortedIndex] = array[unsortedIndex - 1];
				unsortedIndex--;
			}
			
			array[unsortedIndex] = unsortedValue;
		}
		
		return array;
	}

}

package sample.sorting;

/**
 * For visual example, pls reference to:
 * http://me.dt.in.th/page/Quicksort/
 * @author duonghung1269
 *
 */
public class QuickSort extends AbstractSort implements ISort {

	@Override
	public int[] sort(int[] array) {
//		int pivotIndex = array.length / 2;
//		int pivotValue = array[pivotIndex];
//		System.out.println("pivot value: " + pivotValue);
//		
//		int smaller = 0, equal = 0, larger = array.length;
//		while (equal < larger) {
//			if (array[equal] < pivotValue) {
//				swap(array, smaller++, equal++);
//			} else if (array[equal] == pivotValue) {
//				equal++;
//			} else {
//				swap(array, equal, --larger);
//			}
//		}
		
		quicksort(array, 0, array.length - 1);
		
		return array;
	}

	private void quicksort(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int pivotVal = arr[low + (high - low)/2];
		
		while (i <= j) {
			while(arr[i] < pivotVal) {
				i++;
			}
			
			while(arr[j] > pivotVal) {
				j--;
			}
			
			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		
		if (low < j) {
			quicksort(arr, low, j);
		}
		
		if (i < high) {
			quicksort(arr, i, high);
		}
	}
	
	/**
	 * We’ll try to partition the array like a card game.
	 * First, assume that the pivot is the leftmost element.
	 * Flip all the other cards down.
	 * Then, open each card from left to right.
	 * 		If you find a card that is less than the pivot:
	 * 			Swap that card with the card that was first opened (the leftmost open card), and close that leftmost card.
	 * 			Also take note of the last closed card.
	 * 		Otherwise, continue opening the next card.
	 * Swap the last closed card with the pivot (if any).
	 * Open all cards… You will see that the array is already partitioned!
	 * 
	 * @param array
	 * @param low
	 * @param high
	 */
	public void partition(int[] array, int low, int high) {
		// assume pivot is left-most
		int pivotVal = array[low];
		int firstOpenedCardIndex = -1; 
		for (int i = low + 1; i <= high; i++) {
			if (firstOpenedCardIndex == -1) {
				firstOpenedCardIndex = i;
			}
			
			if (array[i] >= pivotVal) {				
				continue;
			}
			
			if (firstOpenedCardIndex == i) {
				firstOpenedCardIndex = -1;
				continue;
			}
			
			swap(array, firstOpenedCardIndex, i);
			firstOpenedCardIndex++;
//			if (firstOpenedCardIndex + 1 <= i) {
//				firstOpenedCardIndex++;
//			}
		}
		
		swap(array, low, firstOpenedCardIndex -1);
	}
	
	public void sort(int[] array, int pivotIndex) {
		int pivotValue = array[pivotIndex];
		
		int smaller = 0, equal = 0, larger = array.length;
		while (equal < larger) {
			if (array[equal] < pivotValue) {
				swap(array, smaller, equal);
				smaller++;
				equal++;
			} else if (array[equal] == pivotValue) {
				equal++;
			} else {
				swap(array, equal++, --larger);
			}
		}
	}
}

package sample.sorting;

public abstract class AbstractSort implements ISort {

	@Override
	public void display(int[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i=0; i < array.length; i++) {
			sb.append(array[i]).append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
	protected void swap(int[] array, int firstIndex, int secondIndex) {
		int tmp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = tmp;
	}
	
}

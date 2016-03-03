package sample.sorting.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sample.sorting.QuickSort;

@RunWith(Parameterized.class)
public class QuickSortTest {
	private QuickSort sort = new QuickSort();
	
	@Parameters
    public static Collection<Object[]> suites() {
		return Arrays.asList(new Object[][] 
			{
				{ new int[] {3, 1, 4, 1, 5, 9, 2, 6, 5, 3}, new int[] {1, 1, 3, 4, 5, 9} }, 
				{ new int[] {4, 2, 3, 5, 7, 6}, new int[] {2, 3, 4, 5, 6, 7} }, 
				{ new int[] {2, 1, 4, 9, 5, 6, 10, 8}, new int[] {1, 2, 4, 5, 6, 8, 9, 10} }
			});
	}
    
    private int[] input;
	private int[] output;
	
	public QuickSortTest(int[] input, int[] expected) {
		this.input = input;
		this.output = expected;
	}
    
    @Test
    public void testSort() {
    	output = sort.sort(input);
    	//sort.partition(input, 0, input.length - 1);
    	sort.display(output);
    }
}

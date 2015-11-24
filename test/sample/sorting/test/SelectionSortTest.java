package sample.sorting.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sample.sorting.BubbleSort;
import sample.sorting.ISort;

@RunWith(Parameterized.class)
public class SelectionSortTest {
	
	private ISort sort = new BubbleSort();
	
	@Parameters
    public static Collection<Object[]> suites() {
		return Arrays.asList(new Object[][] 
			{
				{ new int[] {4, 2, 3, 5, 7, 6}, new int[] {2, 3, 4, 5, 6, 7} }, 
				{ new int[] {2, 1, 4, 9, 5, 6, 10, 8}, new int[] {1, 2, 4, 5, 6, 8, 9, 10} }
			});
	}
	
	private int[] beforeSorting;
	private int[] afterSorting;
	
	public SelectionSortTest(int[] beforeSorting, int[] afterSorting) {
		this.beforeSorting = beforeSorting;
		this.afterSorting = afterSorting;
	}

	@Test
	public void testSort() {
		beforeSorting = sort.sort(beforeSorting);
		assertThat(Arrays.equals(beforeSorting, afterSorting)).isTrue();
		sort.display(afterSorting);
	}
}

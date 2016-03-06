package sample.stringarray.test;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sample.stringarray.MultiplyArray;

@RunWith(Parameterized.class)
public class MultiplyArrayTest {			
	
	@Parameters
    public static Collection<Object[]> suites() {
		return Arrays.asList(new Object[][] 
			{
				{ new int[] {1,2}, new int[] {2, 3, 4}, new int[] {0, 2, 8, 0, 8} },
				{ new int[] {1,2,3}, new int[] {2, 3, 4, 5}, new int[] {0,2,8,8,4,3,5} }
			});
	}
	
	private int[] firstNumbers;
	private int[] secondNumbers;
	private int[] output;
	
	public MultiplyArrayTest(int[] firstNumbers, int[] secondNumbers, int[] results) {
		this.firstNumbers = firstNumbers;
		this.secondNumbers = secondNumbers;
		this.output = results;
	}
	
	@Test
	public void testMultiple() {
		int[] results = MultiplyArray.multiply(firstNumbers, secondNumbers);
		assertThat(Arrays.equals(results, output)).isTrue();
	}
}

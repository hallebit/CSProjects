import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class CSProjectsFactorsTest {

	@Test
	public void testGetFactorEven() {
		int[] testFactors12 = {12, 6, 4, 3, 2, 1};
		ArrayList<Integer> testFactors = arrayToList(testFactors12);
		Assert.assertEquals("Factors of 12 should be 1, 2, 3, 4, 6, 12", testFactors, Factors.getFactors(12));
	}
	
	public void testGetFactorOdd()
	
	public static ArrayList<Integer> arrayToList(int[] testArray) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		for(int i = 0; i < testArray.length; i++) {
			test.add(testArray[i]);
		}
		return test;
	}
}

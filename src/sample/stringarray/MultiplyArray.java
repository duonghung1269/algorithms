package sample.stringarray;

public class MultiplyArray {
	
	public static int[] multiply(int[] firstNumbers, int[] secondNumbers) {
		int length = firstNumbers.length + secondNumbers.length;
		int[] result = new int[length];
		
		for (int firstDigit = firstNumbers.length - 1; firstDigit >= 0; firstDigit--) {
			int carry = 0;
			for (int secondDigit = secondNumbers.length - 1; secondDigit >= 0; secondDigit--) {
				int digitAt = firstDigit + secondDigit + 1;
				result[digitAt] += carry + firstNumbers[firstDigit] * secondNumbers[secondDigit];
				carry = result[digitAt] / 10;
				result[digitAt] %= 10;
			}
			
			result[length - secondNumbers.length -1] += carry;
		}
		
		return result;
	}
	
}

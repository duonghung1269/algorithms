package sample.sovling.problems;

public class ProblemsSolving {
	public static boolean isPerfectSquare(int n) {
		int result = (int) Math.sqrt(n);

		return (result * result) == n;
	}

	/**
	 * Write the code that will take a string , calculate the minimum square that
	 * will contain it and return the converted string
	 * Given a meaningful string that built as clockwise in 2D array, then convert that array to input String
	 * as left to right, top to down:
	 * 
	 * P A Y P A L 
	 * F E R W A I 
	 * A M O N Y S 
	 * S D Y E T T 
	 * R N E S O H 
	 * E T S A F E
	 * 
	 * @param input eg. PAYPALFERWAIAMONYSSDYETTRNESOHETSAFE
	 * @return output as clockwise traverse, eg. PAYPALISTHEFASTERSAFERWAYTOSENDMONEY
	 */
	public static String clockwiseSpriralPattern(String input) {
		int length = input.length();

		if (!isPerfectSquare(length)) {
			throw new IllegalArgumentException(
					"Input string length is not perfect square!");
		}

		/**
		 * Convert to 2 dimensions array 
		 * P A Y P A L 
		 * F E R W A I 
		 * A M O N Y S 
		 * S D Y E T T 
		 * R N E S O H 
		 * E T S A F E
		 */
		int size = (int) Math.sqrt(length);
		char[][] c = new char[size][size];
		int index = 0;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				c[row][col] = input.charAt(index);
				index++;
			}
		}

		int topPassed = 0;
		int rightPassed = 0;
		int bottomPassed = 0;
		int leftPassed = 0;

		int count = 0;
		int topDirection = 1;
		int rightDirection = 2;
		int bottomDirection = 3;
		int leftDirection = 4;

		int direction = topDirection;
		int row = 0;
		int col = 0;
		StringBuilder sb = new StringBuilder();
		while (count < length) {
			switch (direction) {
			case 1:
				if (col < size - rightPassed) {
					sb.append(c[row][col]);
					col++;
					count++;
				} else {
					row++; // reach end, then move to next row
					col--; // reduce col index by 1
					topPassed++;
					direction = rightDirection;
				}
				break;
			case 2: 
				if (row < size - bottomPassed) {
					sb.append(c[row][col]);
					row++;
					count++;
				} else {
					row--; // reduce row by 1
					col--; // reach end, then move to next column on the left
					rightPassed++;
					direction = bottomDirection;
				}
				break;
			case 3:
				if (col >= leftPassed) {
					sb.append(c[row][col]);
					col--;
					count++;
				} else {
					col++; // increase col by 1
					row--; // reach end, then move to next row above
					bottomPassed++;
					direction = leftDirection;
				}
				break;
			case 4:
				if (row >= topPassed) {
					sb.append(c[row][col]);
					row--;
					count++;
				} else {
					row++;
					col++; // reach end, then move to next col
					leftPassed++;
					direction = topDirection;
				}
			}
			
			
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String input = "PAYPALFERWAIAMONYSSDYETTRNESOHETSAFE";
		System.out.print(clockwiseSpriralPattern(input));
	}
}

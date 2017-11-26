package card.games;

import java.math.BigInteger;

public class StringTest {
	public static void main(String[] args) {
		String s = "0000101010000101";
		int k = 4;
		
		int maxLength = BigInteger.valueOf(k).bitLength();
		System.out.println(maxLength);
		for (int i = 0; i <= k; i++) {
			String t = Integer.toBinaryString(i);
			String binaryVal = t;
			int extraZero = 0;
			if (t.length() < maxLength) {
				extraZero = maxLength - t.length();
			}
			if (extraZero != 0) {
				for (int j = 1; j <= extraZero; j++) {
					binaryVal = "0" + binaryVal;
				}
			} else {
				binaryVal = t;
			}
			System.out.println(binaryVal);
		}
	}
}

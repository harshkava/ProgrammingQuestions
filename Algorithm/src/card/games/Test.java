package card.games;

public class Test {

	public static void main(String[] args) {
//		solution("2-4A0r7-4ka", 4);	
//		solution("2-4A0r7-4ka15kl", 3);
//		solution("2-4A", 1);
		solution("2-4A0r7-4k", 10);
//		solution("2-4A0r7-4k", 3); 
	}

	public static String solution(String S, int K) {
		// write your code in Java SE 8

		String input = S.replace("-", "").toUpperCase();
		// System.out.println(input);
		int endGroups = input.length() / K;
		int startGroup = input.length() % K;

//		System.out.println(endGroups);
//		System.out.println(startGroup);

		StringBuilder sb = new StringBuilder();
		System.out.println("sb.length() :" + sb.length());
		if (startGroup != 0) {
			System.out.println("First Group :" + input.substring(0, startGroup));
			sb.append(input.substring(0, startGroup));
		}

		String s2 = input.substring(startGroup);

		String[] result = splitByLength(s2, K);

		for (int j = 0; j < result.length; j++) {
			if (sb.length() != 0) {
				sb.append("-");
			}
			sb.append(result[j]);
			System.out.println(result[j]);
		}
		System.out.println("Final:" + sb.toString());

		return sb.toString();
	}
	 
	 public static String[] splitByLength(String s, int chunkSize)
	 {
	     int arraySize = (int) Math.ceil(s.length() / chunkSize);
	  
	     String[] returnArray = new String[arraySize];
	  
	     int index = 0;
	     for(int i = 0; i < s.length(); i = i+chunkSize)
	     {
	         if(s.length() - i < chunkSize)
	         {
	             returnArray[index++] = s.substring(i);
	         } 
	         else
	         {
	             returnArray[index++] = s.substring(i, i+chunkSize);
	         }
	     }
	  
	     return returnArray;
	 }
}

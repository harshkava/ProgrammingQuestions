import org.omg.CORBA.StringSeqHolder;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = 1234526789;
		
		String s = i.toString();

		
		for (int j = 0; j < s.length()-1; j++) {
			
			System.out.println(s.charAt(j));
			System.out.println(s.charAt(j+1));
			
			System.out.println("*");
			
			int a = Character.getNumericValue(s.charAt(j));
			int b = Character.getNumericValue(s.charAt(j+1));
			if(a > b) {
				System.out.println("a>b");
				break;
			}
			

		}
		
	}

}

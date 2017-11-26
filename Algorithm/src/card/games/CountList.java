package card.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> l = new ArrayList<Integer>();
		
		
		
		int[] a = {1,2,32,3,3,3,5,4,5,};
		
		System.out.println(Arrays.toString(a));
		
//		for (int i = 0; i < a.length; i++) {
//			System.out .println(a[i]);
//			
//		}
		
		l.add(1);
		l.add(1);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(1);
		l.add(13);
		l.add(12);
		l.add(1);
		
		
		
		int count = 0;
		int exp = 1;
		
		l.contains(exp);
		
		System.out.println(l.contains(exp));
		
		for (Integer integer : l) {
			if (exp == integer) {
				count++;
			}
		}
		System.out.println("Count for exp:"+exp+" is :"+count);
	}

	
	
}

import java.util.HashSet;
import java.util.Set;

public class ListNumberTest {

	public static void main(String[] args) {
		int[] a = {0,1,2,3,5,6,8,9};
		int[] b = {0,1,2,3,4,5,6,7,8,9};
		
		Set<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < b.length; i++) {
			h.add(b[i]);
		}
		Set<Integer> k = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			k.add(a[i]);
		}
		
		System.out.println(h.removeAll(k));
		System.out.println(h);
	}
}



import java.util.Stack;

public class StackTest {
public static void main (String[] args) {
	System.out.println("hi");
	
	Stack<String> stk = new Stack<String>();
	
	stk.removeAllElements(); 
	for (int i = 0; i < 10; i++) {
		stk.add(i+"-Joe");
	}
	System.out.println(stk);
	
	
}
	
}

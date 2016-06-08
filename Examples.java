import java.util.*;


//Stack examples
public class Examples {
	
	public static void main(String[] args){
		LinkedStack LS = new LinkedStack();
		LS.push(5);
		LS.push(4);
		LS.push(3);
		LS.push(2);
		LS.push(1);
		System.out.println(LS.pop());
		System.out.println(LS.pop());
		System.out.println(LS.pop());
		System.out.println(LS.pop());
		System.out.println(LS.pop());
		
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(5);
		myStack.push(4);
		myStack.push(3);
		myStack.push(2);
		myStack.push(1);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		Queue myQueue = new Queue();
	}
}

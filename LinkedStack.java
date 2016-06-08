import java.util.NoSuchElementException;

public class LinkedStack {
	Node top;
	int size;
	
	
	//constructor
	public LinkedStack(){
		top = null;
		size = 0;
	}
	
	public int getSize(){
		return size;
	}
	
	public void push(int data){
		
		Node nptr = new Node(data, null);
		if(top == null){
			top = nptr;
		}else{
			nptr.setNext(top);
			top = nptr;
		}
		size++;
	}
	
	public int pop(){
		if(getSize() == 0){
			throw new NoSuchElementException("UnderFlow Exception");
		}
		Node ptr = top;
		top = top.next;
		size--;
		return (int) ptr.getData();
		
	}
}

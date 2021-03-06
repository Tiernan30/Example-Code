
public class LinkedList {
	//Head
	Node head;
	//count
	int listCount;

	public void add(Object data)
	{
		if(head==null)
		{
			head=new Node(data);
		}
		Node nodeTemp=new Node(data);
		Node current=head;
		if(current !=null)
		{
		while(current.getNext()!=null)
		{
		current=current.getNext();
		}
		current.setNext(nodeTemp);
		listCount++;
		}
	}
	
	public Object getHead()
	// returns the element at the specified position in this list.
	{
		return head.getData();
	}
	
	public boolean remove(int index) {
		 
		// if the index is out of range, exit
		if (index < 1 || index > listCount)
			return false;
 
		Node current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return false;
 
				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());
 
			// decrement the number of elements variable
			listCount--;
			return true;
 
		}
		return false;
	}
	
	 
	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index <= 0)
			return null;
		Node current = null;
		if (head != null) {
			current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return null;
 
				current = current.getNext();
			}
			return current.getData();
		}
		return current;
 
	}
	
}

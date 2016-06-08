

public class Node {
Object data;
Node next;

public Node(Object Datavalue)
{
	next=null;
	this.data=Datavalue;
}

public Node(Object Datavalue,Node nextNode)
{
	next=nextNode;
	this.data=Datavalue;
}

public Object getData() {
	return data;
}
 
public void setData(Object dataValue) {
	data = dataValue;
}

public Node getNext() {
	return next;
}

public void setNext(Node nextValue) {
	next = nextValue;
}


}

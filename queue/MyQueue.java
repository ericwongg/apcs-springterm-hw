public class MyQueue {

    private Node head,tail;

    public MyQueue() {
	head = null;
	tail = null;
    }

    public void enqueue(String s) {
	Node n = new Node(s);
	if (head == null) {
	    head = n;
	    tail = n;
	}
	else {
	    tail.setNext(n);
	    tail = tail.getNext();
	}
    }

    public String dequeue() {
	String s = null;
	if (head != null) {
	    s = head.getData();
	    head = head.getNext();
	}
	if (head == null) {
	    tail = null;
	}
	return s;
    }

    public boolean isEmpty() {
	return (head == null);
    }

    public String front() {
	if (head == null)
	    return null;
	else 
	    return head.getData();
    }

    public String toString() {
	String s = "Head --> ";
	if (head == null) {
	    s = s + "Ceci est nes pa une string --> ";
	}
	Node temp = head;
	while (temp != null) {
	    s = s + temp.getData() + " --> ";
	    temp = temp.getNext();
	}
	s = s.substring(0, s.length()-4);
	s = s + "<-- Tail ";
	return s;
    }

}
public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = null;
    }

    public void add(String d) {
	Node temp = new Node(d);
	temp.setNext(head);
	head = temp;
    }

    public String toString() {
	return "" + head;
    }

}
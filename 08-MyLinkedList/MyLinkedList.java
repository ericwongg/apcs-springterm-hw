public class MyLinkedList {

    private Node head;

    public MyLinkedList() {
	head = new Node("");
    }

    public void add(String d) {
	Node temp = new Node(d);
	temp.setNext(head);
	head = temp;
    }

    public void addEnd(String d) {
	Node temp = head;
	while (temp.getNext()!=null) {
	    temp = temp.getNext();
	}
	temp.setNext(new Node(d));
    }

    public String toString() {
	String res = "";
	Node temp = head;
	while (temp!=null) {
	    res = res + temp.getData() + ", ";
	    temp = temp.getNext();
	}
	return res;
    }

    public void add(int i, String s) {
	Node temp = head;
	for (int j=0;j<i+1;j++) {
	    temp = temp.getNext(); 
	    if (temp.equals(null) && j!=i)
		System.exit(10);
	}
	Node add = new Node(s);
	add.setNext(temp.getNext());
	temp.setNext(add);
    }

    public String get(int i) {
	Node temp = head;
	for (int j=0;j<i+1;j++) {
	    temp = temp.getNext();
	    if (temp.equals(null) && j!=i)
		System.exit(10);
	}
	return temp.getData();
    }

    public String set(int i, String s) {
	String res;
	Node temp = head;
	for (int j=0;j<i+1;j++) {
	    temp = temp.getNext();
	    if (temp.equals(null) && j!=i)
		System.exit(10);
	}
	res = temp.getData();
	temp.setData(s);
	return res;
    }

    public String remove(int i) {
	String res;
	Node temp = head;
	for (int j=0;j<i;j++) {
	    temp = temp.getNext();
	    if (temp.equals(null) && j!=i-1)
		System.exit(10);
	}
	res = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return res;
    }

    public int find(String s) {
	int i = 0;
	Node temp = head;
	while (temp!=null) {
	    if (temp.getData().equals(s))
		return i-1;
	    else
		temp = temp.getNext();
		i++;
	}
	return -1;
    }

    public int size() {
	int l = 0;
	Node temp = head;
	while (temp!=null) {
	    temp = temp.getNext();
	    l++;
	}
	return l;
    }


}

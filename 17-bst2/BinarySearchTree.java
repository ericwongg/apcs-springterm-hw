public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
	root = null;
    }

    public void insert(int x) {
	if (root == null) {
	    root = new Node(x);
	    return;
	}
	Node temp = root;
	Node point = temp;
	while (temp != null) {
	    point = temp;
	    if (x < temp.getData())
		temp = temp.getLeft();
	    else 
		temp = temp.getRight();
	}
	Node add = new Node(x);
	if (x < point.getData())
	    point.setLeft(add);
	else
	    point.setRight(add);
    }

    public Node search(int x) {
	Node temp = root;
	while (temp != null) {
	    if (x == temp.getData())
		return temp;
	    else if (x < temp.getData())
		temp = temp.getLeft();
	    else
		temp = temp.getRight();
	}
	return null;
    }

    public Node rsearch(Node c, int x) {
	if (x == c.getData())
	    return c;
	else if (x < c.getData())
	    c = c.getLeft();
	else
	    c = c.getRight();
	return rsearch(c, x);
    }

    public Node searchParent(int x) {
	Node temp = root;
	while (temp!= null && temp.getRight().getData()!= x && temp.getLeft().getData() != x) {
	    if (x < temp.getData())
		temp = temp.getLeft();
	    else
		temp = temp.getRight();
	}
	return temp;
    }

    public void remove(int x) {
	Node par = this.searchParent(x);
	Node del = this.search(x);

	int child = 0;
	if (del.getLeft() != null) 
	    child++;
	if (del.getRight() != null)
	    child++;

	if (child < 2) {
	    if (par.getLeft().equals(del)) {
		if (del.getLeft() == null)
		    par.setLeft(del.getRight());
		else
		    par.setLeft(del.getLeft());
	    }
	    else {
		if (del.getLeft() == null)
		    par.setLeft(del.getRight());
		else
		    par.setLeft(del.getLeft());
	    }
	}
	else {
	    Node smallest = del.getRight();
	    this.remove(smallest.getData());
	    par.setRight(smallest);
	}
    }

    public void traverse() {
	traverse(root);
    }

    public void traverse(Node c) {
	if (c == null) 
	    return;
	else {
	    traverse(c.getLeft());
	    System.out.println(c);
	    traverse(c.getRight());
	}
    }

    public static void main(String[] args) {
	BinarySearchTree b = new BinarySearchTree();
	b.insert(10);
	b.insert(3);
	b.insert(4);
	b.insert(15);
	b.insert(24);
	b.insert(13);
	b.insert(14);
	b.traverse();
	b.remove(3);
	b.remove(15);
	b.traverse();
    }

}

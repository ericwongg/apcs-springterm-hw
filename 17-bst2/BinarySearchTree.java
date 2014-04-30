public class BinarySearchTree {

    private node root;

    public BinarySearchTree(int n) {
	root = new Node(n);
    }

    public void insert(int x) {
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

    public node search(int x) {
	node temp = root;
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
	return search2(c, x);
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
	    this.remove(smallest);
	    parent.setRight(smallest);
	}
    }

}

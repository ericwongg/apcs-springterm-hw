public class BinarySearchTree {

    private node root;

    public BinarySearchTree(int n) {
	root = new Node(n);
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

    public Node search2() {
	return search2(root, x);
    }

    public Node search2(Node c, int x) {
	if (x == c.getData())
	    return c;
	else if (x < c.getData())
	    c = c.getLeft();
	else
	    c = c.getRight();
	return search2(c, x);
    }

}

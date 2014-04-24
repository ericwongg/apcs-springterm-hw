public class BinarySearchTree {

    private node root;

    public BinarySearchTree(int n) {
	root = new Node(n);
    }

    public void insert(int x) {
	Node temp = root;
	Node point = temp;
	while (temp != null) {
	    if (x<temp.getData())
		temp = temp.getLeft();
	    else 
		temp = temp.getRight();
	    point = temp;
	}
	Node add = new Node(x);
	if (x<point.getData())
	    point.setLeft(add);
	else
	    point.setRight(add);
    }

    public node search(int x) {
	node temp = root;
	while ((temp != null) && (temp.getData() != x)) {
	    if (x<temp.getData())
		temp = temp.getLeft();
	    else
		temp = temp.getRight();
	}
	return temp;
    }

}
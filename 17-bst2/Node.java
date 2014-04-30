public class Node {

    private int data;
    private Node left, right;

    public Node(int n) {
	data = n;
	left = null;
	right = null;
    }

    public void setLeft(Node l) {
	left = l;
    }
    public void setRight(Node r) {
	right = r;
    }

    public int getData() {
	return data;
    }
    public Node getLeft() {
	return left;
    }
    public Node getRight() {
	return right;
    }

    public String toString() {
	return "" + data;
    }

}
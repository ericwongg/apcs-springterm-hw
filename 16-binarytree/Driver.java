public class Driver {

    public static void main(String[] args) {
	/*
	Node n = new Node(4);
	System.out.println(n);
	n.setLeft(2);
	System.out.println(n.getLeft());
	n.setRight(3);
	System.out.println(n.getRight());
	*/

	BinarySearchTree b = new BinarySearchTree();
	b.insert(10);
	System.out.println(b.getRoot());

    }

}
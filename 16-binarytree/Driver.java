public class Driver {

    public static void main(String[] args) {
	Node n = new Node(4);
	System.out.println(n);
	n.setLeft(2);
	System.out.println(n.getLeft());
	n.setRight(3);
	System.out.println(n.getRight());
    }

}
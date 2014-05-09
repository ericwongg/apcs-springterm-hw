public class Driver {

    public static void main(String[] args) {
	HeapSort h = new HeapSort();

	h.insert(4);
	h.insert(2);
	h.insert(15);
	h.insert(71);
	h.insert(13);
	h.insert(14);


	System.out.println(h.removeMax());
	System.out.println(h.removeMax());
	System.out.println(h.removeMax());
	System.out.println(h.removeMax());
	System.out.println(h.removeMax());
	System.out.println(h.removeMax());
	System.out.println(h.removeMax());

    }

}
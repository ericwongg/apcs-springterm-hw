public class LLDriver {

    public static void main(String[] args) {

	MyLinkedList L = new MyLinkedList();
	//System.out.println(L);
	L.add("Sully");
	//System.out.println(L);
	L.add("Mike");
	//System.out.println(L);
	L.add("Randall");
	//System.out.println(L);
	L.add("Boo");
	System.out.println(L);
       
	System.out.println("Sully is at " + L.find("Sully"));
	System.out.println("Length= " + L.length());

	L.add(2, "Steve");
	System.out.println(L);
	L.set(3, "Jobs");
	System.out.println(L);
	System.out.println(L.remove(2));
	System.out.println(L);

    }

}

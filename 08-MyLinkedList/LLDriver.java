public class LLDriver {

    public static void main(String[] args) {

	MyLinkedList2 L = new MyLinkedList2();
      	L.add("Sully");
       	L.add("Mike");
       	L.add("Randall");
       	L.add("Boo");
	System.out.println(L);
       
	System.out.println("Sully is at " + L.find("Sully"));
	System.out.println("Length= " + L.size());

	L.add(2, "Steve");
	System.out.println(L);
	L.set(3, "Jobs");
	System.out.println(L);
	System.out.println(L.remove(2));
	System.out.println(L);

	L.add("Albert");
	System.out.println(L);

    }

}

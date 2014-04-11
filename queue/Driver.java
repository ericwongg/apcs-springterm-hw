public class Driver {

    public static void main(String[] args) {
	MyQueue q = new MyQueue();
	System.out.println(q);
	q.enqueue("first");
	System.out.println(q);
	q.enqueue("second");
	System.out.println(q);
	q.enqueue("third");
	System.out.println(q);
	System.out.println(q.front());
	System.out.println(q.dequeue() + " | " + q);
	System.out.println(q.dequeue() + " | " + q);
     	System.out.println(q.dequeue() + " | " + q);
	System.out.println(q.dequeue() + " | " + q);
    }
}
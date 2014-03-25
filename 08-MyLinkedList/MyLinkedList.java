import java.io.*;
import java.util.*;

public class MyLinkedList<E> implements Iterator<E> {

    private Node<E> head;

    public Iterator<E> iterator(){
	return new MyLLIterator<E>(head);
    }

    public MyLinkedList() {
	head = null;
    }

    public void add(E d) {
	Node<E> temp = new Node<E>(d);
	temp.setNext(head);
	head = temp;
    }

    public String toString() {
	String res = "";
	Node<E> temp = head;
	while (temp!=null) {
	    res = res + temp.getData() + ", ";
	    temp = temp.getNext();
	}
	return res;
    }

    public void add(int i, E s) {
	Node<E> temp = head;
	for (int j=0;j<i+1;j++) {
	    temp = temp.getNext(); 
	    if (temp.equals(null) && j!=i)
		System.exit(10);
	}
	Node<E> add = new Node<E>(s);
	add.setNext(temp.getNext());
	temp.setNext(add);
    }

    public E get(int i) {
	Node temp = head;
	for (int j=0;j<i+1;j++) {
	    temp = temp.getNext();
	    if (temp.equals(null) && j!=i)
		System.exit(10);
	}
	return temp.getData();
    }

    public E set(int i, E s) {
	E res;
	Node<E> temp = head;
	for (int j=0;j<i+1;j++) {
	    temp = temp.getNext();
	    if (temp.equals(null) && j!=i)
		System.exit(10);
	}
	res = temp.getData();
	temp.setData(s);
	return res;
    }

    public E remove(int i) {
	E res;
	Node<E> temp = head;
	for (int j=0;j<i;j++) {
	    temp = temp.getNext();
	    if (temp.equals(null) && j!=i-1)
		System.exit(10);
	}
	res = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return res;
    }

    public int find(E s) {
	int i = 0;
	Node<E> temp = head;
	while (temp!=null) {
	    if (temp.getData().equals(s))
		return i-1;
	    else
		temp = temp.getNext();
		i++;
	}
	return -1;
    }

    public int size() {
	int l = 0;
	Node temp = head;
	while (temp!=null) {
	    temp = temp.getNext();
	    l++;
	}
	return l;
    }


}

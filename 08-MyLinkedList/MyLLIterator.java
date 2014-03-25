import java.io.*;
import java.util.*;

public class MyLLIterator<E> implements Iterator<E> {

    private Node<E> currentNode;

    public MyLLIterator<E>(Node<E> n) {
	currentNode = n;
    }

    public boolean hasNext() {
	return (!currentNode.getNext() == null);
    }

    public E next() {
	Node<E> temp = currentNode;
	currentNode = currentNode.getNext();
	return temp;
    }

    public void remove() {
    }

}

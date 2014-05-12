public class HeapSort {

    private int[] heap;
    private int lastI;

    public HeapSort() {
	heap = new int[50];
	lastI = -1;
    }

    public void increaseSize() {
	int[] temp = new int[heap.length + 50];
	for (int i=0;i<heap.length;i++) {
	    temp[i] = heap[i];
	}
	heap = temp;
    }

    public void pushDown(int i) {
	int child1 = i*2;
	int child2 = i*2 + 1;

	if(child1 <= lastI && child2 <= lastI) {
	    if (heap[i] > heap[child1] && heap[i] > heap[child2])
		return;
	    else {
		int temp = heap[i];
		if (heap[i] < heap[child1] && heap[child1] > heap[child2]) {
		    heap[i] = heap[child1];
		    heap[child1] = temp;
		    pushDown(child1);
		}
		else if (heap[i] < heap[child2] && heap[child2] > heap[child1]) {
		    heap[i] = heap[child2];
		    heap[child2] = temp;
		    pushDown(child2);
		}
	    }
	}
    }

    public void pushUp(int i) {
	int parent = i/2;
	
	if (heap[i] <= heap[parent])
	    return;
	else {
	    int temp = heap[i];
	    heap[i] = heap[parent];
	    heap[parent] = temp;
	    pushUp(parent);
	}
    }

    public int getMax() {
	return heap[1];
    }

    public int removeMax() {
	if (lastI < 0) {
	    System.out.println("Nothing in the heap");
	    return -1;
	}

	//replace root with lowest leaf;
	int temp = heap[0];
	heap[0] = heap[lastI];
	heap[lastI] = temp;
	lastI--;

	pushDown(0);

	return temp;
    }

    public void insert(int i) {
	//add int to lowest leaf;
	lastI++;
	heap[lastI] = i;
	pushUp(lastI);
    }

    public String toString() {
	String res = "";
	for (int i=0;i<heap.length;i++) {
	    res = res + heap[i] + ", ";
	}
	return res;
    }

}

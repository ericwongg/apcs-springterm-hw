public class Median {

    private MinHeap low;
    private MaxHeap high;

    public Median() {
	low = new MinHeap();
	high = new MaxHeap();
    }

    public void add(int n) {
	if (low.getSize() == 0) {
	    low.insert(n);
	    return;
	}
	if (high.getSize() == 0) {
	    high.insert(n);
	    return;
	}

	if (n < low.getMax())
	    low.insert(n);
	else 
	    high.insert(n);

	if (Math.abs(low.getSize()-high.getSize())>1)

    }

    public int getMedian() {

    }

    public int removeMedian() {

    }

}
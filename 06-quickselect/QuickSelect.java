import java.io.*;
import java.util.*;

public class QuickSelect {

    public int quickselect(int[] a, int k, int low, int high) {

	if (low >= high)
	    return low;
	else {
	    int middle = (high + low)/2;
	    System.out.println(middle);
	    int pivot = a[middle];
	    System.out.println(pivot);
	    int[] temp = new int[a.length];
	    int l=0, h=1;

	    //partitioning array
	    for (int i=low;i<high;i++) {
		if (a[i] < pivot){
		    temp[low+l] = a[i];
		    l++;
		}
		else if (a[i] > pivot) {
		    temp[high-h] = a[i];
		    h++;
		}
	    }
	    temp[low+l] = pivot;
	    a = temp;
	    System.out.println(Arrays.toString(a));

	    //if random pivot chosen is index we look for
	    int i = indexOf(a, pivot);
	    if (i == k) {
		return pivot;
	    }
	    //altering paramemter depending on where the pivot placed
	    else if (i > k) {
		return quickselect(a, k, low, i-1);
	    }
	    else {
		return quickselect(a, k, i+1, high);
	    }
	}
    }

    public int indexOf(int[] a, int k) {
	for (int i=0;i<a.length;i++) {
	    if (a[i] == k)
		return i;
	}
	return -1;
    }

    public int[] makeArray(int n) {
	Random rnd = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]= rnd.nextInt(100);
	return a;
    }

    public static void main(String[] args) {
	QuickSelect q = new QuickSelect();
	int[] in = q.makeArray(10);
	System.out.println(Arrays.toString(in));
	System.out.println(q.quickselect(in,4,0,in.length));

    }



}

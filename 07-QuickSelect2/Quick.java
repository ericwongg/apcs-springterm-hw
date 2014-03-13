import java.util.*;

public class Quick {

    public Integer[] quickSort(Integer[] l) {
	if (l.length <= 1)
	    return l;
	else {
	    Random r = new Random();
	    int pivoti = r.nextInt(l.length);
	    int pivot = l[pivoti];

	    ArrayList<Integer> lower = new ArrayList<Integer>();
	    ArrayList<Integer> upper = new ArrayList<Integer>();

	    for (int i=0;i<l.length;i++) {
		if (l[i] < pivot) 
		    lower.add(l[i]);
		else if (l[i] > pivot)
		    upper.add(l[i]);
	    }
	    lower.add(pivot);

	    Integer[] r1 = lower.toArray(new Integer[]{});
	    r1 = lower.toArray(r1);
	    Integer[] r2 = upper.toArray(new Integer[]{});
	    r2 = upper.toArray(r2);

	    r1 = quickSort(r1);
	    r2 = quickSort(r2);

	    l = combine(r1, r2);
	    return l;
	}
    }

    public Integer[] combine(Integer[] r1, Integer[] r2) {
	Integer[] ans = new Integer[r1.length + r2.length];

	for (int i=0;i<r1.length;i++) {
	    ans[i] = r1[i];
	}
	for (int i=0;i<r2.length;i++) {
	    ans[i+r1.length] = r2[i];
	}
	return ans;
    }

    public Integer[] makeArray(int n) {
	Random rnd = new Random();
	Integer[] a = new Integer[n];
	for (int i=0;i<n;i++)
	    a[i]=new Integer(rnd.nextInt(100));
	return a;
    }

    public int partition(int[] a, int L, int R) {
	Random rnd = new Random();
	int pivoti = rnd.nextInt(R-L);
	int pivot = a[pivoti];
	int wall = L;

	a[pivoti] = a[R];
	a[R] = pivot;

	for (int i=L;i<R;i++) {
	    int cur = a[i];
	    if (cur < pivot) {
		a[i] = a[wall];
		a[wall] = cur;
		wall++;
	    }
	}

	a[R] = a[wall];
	a[wall] = pivot;

	return wall;
    }

    public boolean inOrder(int[] a) {
	for (int i=0;i<a.length-1;i++) {
	    int last = a[i];
	    if (a[i+1] < last)
		return false;
	}
	return true;
    }

    public int[] quickSort2(int[] a) {
	if (!inOrder(a)){
	    partition(a, 0, a.length/2);
	    partition(a, a.length/2+1, a.length);
	else 
	    return a;
    }

    public int[] makeArray2(int n) {
	Random rnd = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]= rnd.nextInt(100);
	return a;
    }

    public static void main(String[] args) {
	Quick q = new Quick();
	//Integer[] in = q.makeArray(10);
	//System.out.println(Arrays.toString(in));
	//Integer[] out = q.quickSort(in);
	//System.out.println(Arrays.toString(out));
	int[] in = q.makeArray2(10);
	System.out.println(Arrays.toString(in));
	int[] out = q.quickSort2(in);
	System.out.println(Arrays.toString(out));

    }



}

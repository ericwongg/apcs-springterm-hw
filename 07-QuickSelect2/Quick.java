import java.util.*;

public class Quick {


    //QUICK SORT 1st TRY
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

    public Integer[] makeArray1(int n) {
	Random rnd = new Random();
	Integer[] a = new Integer[n];
	for (int i=0;i<n;i++)
	    a[i]=new Integer(rnd.nextInt(100));
	return a;
    }


    //QUICK SORT WITH WALL PARTITION
    public int partition(int[] a, int L, int R) {
	Random rnd = new Random();
	int pivoti = L+rnd.nextInt(R-L);
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

    public void quickSort2(int[] a) {
	quickSort2(a, 0, a.length-1);	
    }

    public void quickSort2(int[] a, int L, int R) {
	if (R-L <= 1)
	    return;
	else {
	    int pindex = partition(a,L,R);
	    if (pindex-1 > L)
		quickSort2(a,L,pindex-1);
	    if (pindex+1 < R)
		quickSort2(a,pindex+1,R);
	}
    }

    //QUICK SORT WITH BETTER PARTITION

    public int part(int[] a, int L, int R) {
	Random rnd = new Random();
	int pivoti = L+rnd.nextInt(R-L);
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

	int wall2 = wall;
	for (int j=wall;j<R;j++) {
	    int cur = a[j];
	    if (cur == pivot) {
		a[j] = a[wall2];
		a[wall2] = cur;
		wall2++;
	    }
	}

	a[R] = a[wall];
	a[wall] = pivot;

	return wall;
    }

    public void quickSort3 (int[] a) {
	quickSort3(a, 0, a.length-1);
    }

    public void quickSort3 (int[] a, int L, int R) {
	if (!inOrder(a) || R-L > 1) {
	    int pindex = partition(a, L, R);
	    if (pindex-1 > L)
		quickSort3(a, L, pindex-1);
	    if (pindex+1 < R)
		quickSort3(a, pindex+1, R);
	}
    }

    public boolean inOrder(int[] a) {
	for (int i=0;i<a.length-1;i++) {
	    int last = a[i];
	    if (a[i+1] < last)
		return false;
	}
	return true;
    }

    public int[] makeArray(int n) {
	Random rnd = new Random();
	int[] a = new int[n];
	for (int i=0;i<n;i++)
	    a[i]= rnd.nextInt(100);
	return a;
    }

    public static void main(String[] args) {
	Quick q = new Quick();
	long start, end;
	//Integer[] in = q.makeArray1(10);
	//start = System.currentTimeMillis();
	//Integer[] out = q.quickSort(in);
	//end = System.currentTimeMillis();
	//System.out.println(end - start);
	int[] in = q.makeArray(1000000);
	//start = System.currentTimeMillis();
	//q.quickSort2(in);
	//end = System.currentTimeMillis();
	//System.out.println(end - start);
	//start = System.currentTimeMillis();
	//q.quickSort3(in);
	//end = System.currentTimeMillis();
	//System.out.println(end - start);


    }



}

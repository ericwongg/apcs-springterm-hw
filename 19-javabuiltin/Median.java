//Worked with Michelle Chen

import java.util.*;
import java.io.*;

public class Median {

    private PriorityQueue min;
    private PriorityQueue max;
    private MinCompare comp = new MinCompare();

    public Median() {
	max = new PriorityQueue(100);
	min = new PriorityQueue(100, comp);
    }

    public void insert(int n) {
	if (max.size() == 0){
	    max.add(n);
	    return;
	}else if (min.size() == 0) {
	    min.add(n);
	    return;
	}

	int check = (Integer) min.peek();
	if (n < check)
	    min.add(n);
	else 
	    max.add(n);
	resize();
    }

    public void resize() {
	if (Math.abs(max.size()-min.size()) > 1) {
	    if (max.size() > min.size())
		min.add(max.poll());
	    else
		max.add(min.poll());
	}
    }

    public int findMedian() {
	int ans;
	if ((max.size() + min.size())%2 == 0) {
	    ans = (Integer)max.peek() + (Integer)min.peek();
	    ans = ans/2;
	}
	else if (max.size()>min.size()) 
	    ans = (Integer) max.peek();
      	else 
	    ans = (Integer) min.peek();
       
	return ans;
    }

   public int removeMedian() {
	int ans;
	if ((max.size() + min.size())%2 == 0) {
	    ans = (Integer)max.poll() + (Integer)min.poll();
	    ans = ans/2;
	}
	else if (max.size()>min.size()) 
	    ans = (Integer) max.poll();
      	else 
	    ans = (Integer) min.poll();
       
	return ans;
    }

    public static void main(String[] args) {
	Median m = new Median();
	m.insert(10);
	m.insert(2);
	m.insert(3);
	m.insert(5);
	m.insert(14);

	System.out.println(m.removeMedian());
	System.out.println(m.findMedian());
    }
	    
    
}
    
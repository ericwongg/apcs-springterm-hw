public class MyStack {

    private String[] stack;
    private int numElts;

    public MyStack() {
	stack = new String[10];
	numElts = 0;
    }

    public void push(String s) {
	if (numElts > stack.length) {
	    String[] temp = new String[stack.length+10];
	    for (int i=0;i<stack.length;i++) {
		temp[i] = stack[i];
	    }
	    stack = temp;
	}
	for (int i=stack.length-1;i>0;i--) {
	    stack[i] = stack[i-1];
	}
	numElts = numElts + 1;
	stack[0] = s;
    }

    public String pop() {
	String s = stack[0];
	for (int i=0;i<stack.length-1;i++) {
	    stack[i] = stack[i+1];
	}
	numElts = numElts - 1;
	return s;
    }

    public String peek() {
	return stack[0];
    }

    public boolean isEmpty() {
	return stack[0] == null;
    }

    public String toString() {
	String s = "";
	for (int i=0;i<stack.length;i++) {
	    s += stack[i] + ", ";
	}
	return s;
    }

}

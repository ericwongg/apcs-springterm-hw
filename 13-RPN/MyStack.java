public class MyStack {

    private char[] stack;
    private int numElts;

    public MyStack() {
	stack = new char[10];
	numElts = 0;
    }

    public void push(char s) {
	if (numElts > stack.length) {
	    char[] temp = new char[stack.length+10];
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

    public char pop(int n) {
	char s = stack[n];
	for (int i=n;i<stack.length-1;i++) {
	    stack[i] = stack[i+1];
	}
	numElts = numElts - 1;
	return s;
    }

    public char peek(int i) {
	return stack[i];
    }

    public int size() {
	return numElts;
    }

    public String toString() {
	String s = "";
	for (int i=0;i<stack.length;i++) {
	    s += stack[i] + ", ";
	}
	return s;
    }

}

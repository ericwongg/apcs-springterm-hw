import java.io.*;
import java.util.*;


public class RPN {

    private Scanner sc;
    private MyStack stack;
    private double one,two;
    private char res;

    public RPN() {
	ans = 0.0;
	sc = new Scanner(System.in);
	stack = new MyStack();
    }

    public double calculate() {
	String s = sc.nextLine();
	for (int i=0;i<s.length();i++) {
	    char c = s.charAt(i);
	    stack.push(c);
	}
	while (stack.size() > 1) {
	    for (int i=0;i<stack.size();i++) {
		if (stack.peek(i) == '+') {
		    one = stack.pop(i);
		    two = stack.pop(i);
		    res = this.add(one, two);
		    System.out.println(res);
		    stack.push(res);
		}
		if (stack.peek(i) == '-') {
		    one = stack.pop(i);
		    two = stack.pop(i);
		    res = this.sub(one, two);
		    System.out.println(res);
		    stack.push(res);
		}
		if (stack.peek(i) == '*') {
		    one = stack.pop(i);
		    two = stack.pop(i);
		    res = this.mult(one, two);
		    System.out.println(res);
		    stack.push(res);
		}
		if (stack.peek(i) == '/') {
		    one = stack.pop(i);
		    two = stack.pop(i);
		    res = this.div(one, two);
		    System.out.println(res);
		    stack.push(res);
		}
	    }
	}
	return stack.pop(0);
    }

    public char add(double n1, double n2) {
	return (char)n1 + n2;
    }

    public char sub(double n1, double n2) {
	return (char)n1 - n2;
    }

    public char mult(double n1, double n2) {
	return (char)n1 * n2;
    }

    public char div(double n1, double n2) {
	return (char)n1 / n2;
    }

    public static void main(String[] args) {
	RPN a = new RPN();
	System.out.println("RPN Calculator");
	a.calculate();


    }



}

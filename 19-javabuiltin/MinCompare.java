//Worked with Michelle Chen

import java.util.*;
import java.io.*;

public class MinCompare implements Comparator<Integer> {

    public int compare(Integer n1, Integer n2) {
	return (n1.compareTo(n2) * (-1));
    }


}
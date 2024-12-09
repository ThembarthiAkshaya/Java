package collections_topic;

//importing util package
import java.util.*;

public class NumericHashSetExample {

	public static void main(String[] args) {
		// ArrayList of numbers
		ArrayList<Integer> numericdata = new ArrayList<Integer>();

		// inserting data
		numericdata.add(45);
		numericdata.add(65);
		numericdata.add(45);
		numericdata.add(75);
		numericdata.add(45);
		numericdata.add(95);
		numericdata.add(35);
		numericdata.add(45);
		numericdata.add(50);

		// to remove duplicate elements
		HashSet<Integer> numericList = new HashSet<Integer>(numericdata);
		System.out.println(numericList);
	}

}

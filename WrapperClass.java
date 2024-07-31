/*writing a program n wrapper classes*/

package com.apjfsa;

public class WrapperClass {

	// crating main method
	public static void main(String[] args) {
		// Auto boxing
		int i = 10;
		// Integer iii=Integer.valueOf(i);
		Integer ii = i;
		System.out.println(i);
		System.out.println(ii);

		// un boxing
		Integer j = 14;
		int jj = j;// un boxing
		System.out.println(j);
		System.out.println(jj);
	}
}

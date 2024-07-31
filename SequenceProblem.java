//program on printing sequence with some condition
package com.apjfsa;

public class SequenceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int t=2;
         while(t<=442)
         {
        	if(t%4==0)
        	 System.out.print(-t+",");
        	else
        		System.out.print(t+",");
            t+=2;
         }
	}

}

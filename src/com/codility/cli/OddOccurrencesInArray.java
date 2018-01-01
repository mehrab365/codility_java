package com.codility.cli;

import java.util.Arrays;

public class OddOccurrencesInArray {
	public int solution(int[] A) {
	   Arrays.sort(A);
	   for (int i = 0; i < A.length; i++) {
		   System.out.print(A[i]);
	  }
	   try {
		   for (int i=0; i<A.length; i+=2) {
	        	if(A[i] != A[i+1] && i==0) {
	        		return A[i];
	        	}else if(A[i] != A[i+1] && i < A.length-1 && A[i+1] != A[i+2]) {
	        		return A[i+1];
	        	}
	        }
		
		} catch (Exception e) {
			return A[A.length-1];
		}
	   return 0;
        	       
	}

	public static void main(String[] args) {
		
		OddOccurrencesInArray o = new OddOccurrencesInArray();
		System.out.println(o.solution(new int []{6,3,6,3,6,3,5,3,1,3,6}));
	}

}

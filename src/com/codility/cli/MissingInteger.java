package com.codility.cli;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MissingInteger {

	public static int solution(int[] A) {
//		int missing_int = 1;
//		if(A.length == 0)
//			return missing_int;
//		
//		List<Integer> intList= new ArrayList<>();
//		for (int i = 0; i < A.length; i++) {
//			if (A[i] > 0)
//				intList.add(A[i]);
//		}
//		
//		while(intList.contains(missing_int)) {
//			missing_int++;
//		}
//		
//		return missing_int;
		int smallestMissingInteger = 1;
	    if (A.length == 0) {
	        return smallestMissingInteger;
	    }
	    Set<Integer> set = new HashSet<Integer>();
	    for (int i = 0; i < A.length; i++) {
	        if (A[i] > 0) {
	            set.add(A[i]);
	        }
	    }
	    while (set.contains(smallestMissingInteger)) {
	        smallestMissingInteger++;
	    }
	    return smallestMissingInteger;
	}
	public static void main(String[] args) {
		System.out.println(solution(new int [] {1, 3, 6, 4, 1, 2}));
		System.out.println(solution(new int [] {1, 2 ,3}));
		System.out.println(solution(new int [] {-1, -3}));

	}

}

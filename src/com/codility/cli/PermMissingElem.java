package com.codility.cli;

import java.util.Arrays;

public class PermMissingElem {
	
	public int solution(int[] A) {
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		try {
			for (int i = 0; i < A.length; i++) {
				if(A[i] != i+1) {
					return  i +1; 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return A.length + 1;
	}

	public static void main(String[] args) {
		PermMissingElem elem = new PermMissingElem();
		System.out.println(elem.solution(new int[] {2,3}));

	}

}

package com.codility.cli;

public class FrogRiverOne {
	
	@SuppressWarnings("unused")
	public static int solution(int X, int[] A) {
		for (int i = 0; i < A.length; i++) {
			if(A[i] == X)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {1,3,1,4,2,3,5,4}));

	}

}

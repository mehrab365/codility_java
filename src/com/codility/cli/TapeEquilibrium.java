package com.codility.cli;

public class TapeEquilibrium {
	
	

	public static int solution(int[] A) {
		int prev = 0;
		int total = 0;
		int difference = Integer.MAX_VALUE;
		int length = A.length;
		for (int i = 0; i < length; i++) {
			total += A[i];
		}
		
		int next = 0;
		for (int j = 1; j < length; j++) {
			prev += A[j-1];
			next = total - prev;
			difference = Math.min(difference, Math.abs(prev - next));
		}
		return difference;
	}
//	public static int solution(int[] A) {
//        int total = 0;
//
//		for (int i = 0; i < A.length; i++)
//			total += A[i];
//
//		int diff = Integer.MAX_VALUE;
//		int prev = 0;
//		int next = total;
//
//		for (int p = 1; p < A.length; p++) {
//			prev += A[p - 1];
//			next = total - prev;
//			diff = Math.min(diff, Math.abs(prev - next));
//		}
//
//		return diff;
//    }
	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2,4,3}));

	}

}

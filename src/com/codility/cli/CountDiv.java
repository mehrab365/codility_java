package com.codility.cli;

public class CountDiv {
	public static int solution(int A, int B, int K) {
//		int count = 0;
//		if(A>B) {
//			count = A;
//			A = B;
//			B = count;
//			count = 0;
//		}
//		for (int i = A; i < B+1; i++) {
//			if(i % K == 0)
//				count++;
//		}
//		return count;
	    int offsetForLeftRange = 0;
	    if ( A % K == 0) { ++offsetForLeftRange; }

	    return  (B/K) - (A /K) + offsetForLeftRange;
		
	}

	public static void main(String[] args) {
		System.out.println(solution(5, 11, 2));
		System.out.println(solution(0, 0, 11));

	}

}

package com.codility.cli;

import java.util.Arrays;

public class CyclicRotationArray {

	public int[] solution(int[] A, int K) {
		try {
			int length = A.length - 1;
			for (int a = 0; a < K; a++) {
				int temp = A[length];
				for (int i = length; i > 0; i--) {
					A[i]= A[i-1];	
				}
				A[0] = temp;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return A;
	}
	public static void main(String[] args) {
		CyclicRotationArray cyclicRotationArray = new CyclicRotationArray();
		System.out.println(Arrays.toString(cyclicRotationArray.solution(new int[] {1, 2, 3, 4}, 4)));
		System.out.println(Arrays.toString(cyclicRotationArray.solution(new int[] {}, 4)));
		System.out.println(Arrays.toString(cyclicRotationArray.solution(new int[] {3,6,9,5,4,2}, 4)));

	}

}

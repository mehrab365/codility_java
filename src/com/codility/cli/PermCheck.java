package com.codility.cli;

import java.util.Arrays;

public class PermCheck {

	public int solution(int[] A) {
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		try {
			for (int i = 0; i < A.length; i++) {
				if(A[i] != i+1) {
					return  0; 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}
	public static void main(String[] args) {
		

	}

}

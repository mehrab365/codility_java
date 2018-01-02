package com.codility.cli;

public class PassingCars {
	public static int solution(int[] A) {
		int p = 0;
		int total = 0;
		for (int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				p ++;
			}else {
				total += p;
				 if (total > 1000000000) {
		                return -1;
		            }
			}
		}
		return total;
	}
	

	public static void main(String[] args) {
		System.out.println(solution(new int [] {0,1,0,1,1}));

	}

}

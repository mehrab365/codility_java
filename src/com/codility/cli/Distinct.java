package com.codility.cli;

import java.util.Arrays;

public class Distinct {
	public static int solution(int[] A) {
		return (int) Arrays.stream(A).distinct().count();
	}

	public static void main(String[] args) {
		System.out.println(solution(new int [] {1,2,2,1,3,1,2,3,3,4}));

	}

}

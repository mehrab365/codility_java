package com.codility.cli;

public class FrogJmp {
	
	public int solution(int X, int Y, int D) {
		Double jump = 0.0;
		try {
			jump = (Y-X)/(double)D;
			jump = Math.ceil(jump);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jump.intValue();

	}
	public static void main(String[] args) {
		FrogJmp frogJmp = new FrogJmp();
		System.out.println(frogJmp.solution(10, 85, 30));
	}

}

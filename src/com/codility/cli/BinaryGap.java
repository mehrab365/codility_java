package com.codility.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
	
	private static int getBinaryGap(int number) {
		
		int fromIndex = 0;
		List<Integer> gaps = new ArrayList<>();
		
		String binaryString = Integer.toBinaryString(number);
		System.out.println(binaryString);
		do {
			int currentIndex = binaryString.indexOf("1", fromIndex );
			if (currentIndex > -1) {
				gaps.add(currentIndex - fromIndex);
				fromIndex = currentIndex + 1;
			} else {
				System.out.println(gaps);
				fromIndex = currentIndex;
			}
		} while (fromIndex != -1);
		
		return gaps.size() > 0 ? Collections.max(gaps) : 0;
	}
	
	private static int getBinaryGap2(int number) {
		List<String> gaps = new ArrayList<>();
		try {
			String binaryString = Integer.toBinaryString(number);
			binaryString = binaryString.substring(0, binaryString.lastIndexOf("1"));
			String[] strArray = binaryString.split("1");
			gaps = Arrays.asList(strArray);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return gaps.size() > 0 ? Collections.max(gaps).length() : 0;
	}
	
	public static void main(String[] args) {
		System.out.println("Start program");
//		System.out.println("getBinaryGap: " +getBinaryGap(529));
		System.out.println("getBinaryGap2: " + getBinaryGap2(529));
		System.out.println("getBinaryGap2: " + getBinaryGap2(328));
		System.out.println("end program");
	}

}

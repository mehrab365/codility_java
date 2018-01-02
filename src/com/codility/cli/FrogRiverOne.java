package com.codility.cli;

public class FrogRiverOne {
	
	public static int solution(int X, int[] A) {
		try {
		int steps = X;
        boolean[] bitmap = new boolean[steps+1];
	    for(int i = 0; i < A.length; i++){
	        if(!bitmap[A[i]]){
	            bitmap[A[i]] = true;
	            steps--;
	        }
	        if(steps == 0) return i;
	    }
		}catch(Exception e) {
			return -1;
			}
	    return -1;
//		Map<Integer, Integer> iMap= new HashMap<>();
//		for (int i = 0; i < A.length; i++) {
//			iMap.put(A[i], i);
//		}	

//		List<Integer> iList = Arrays.stream(A).boxed().collect(Collectors.toList());
//		int x = iList.indexOf(X);
//		for (int i = 1; i <iList.size(); i++) {
//			if(x == -1 || x>= iList.indexOf(i))
//				return x;
//			else
//				x= iList.indexOf(i);
//			
//		}
//		int count = 1;
//		int x = iList.indexOf(X);
//		
//		System.out.println(iList.indexOf(7));
//		try {
//			while (x > count && x != -1) {
//				x = iList.indexOf(count) >=x || iList.indexOf(count) == -1 ? iList.indexOf(count) : x;
//				count ++;
//			}
//		} catch (Exception e) {
//			return -1;
//		}
//		
		
		
//		for (int i = 0; i < A.length; i++) {
//			System.out.println(iMap.get(i));
//			if(A[i] == X)
//				return i;
//		}
		
//		return x;
	}

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));

	}

}

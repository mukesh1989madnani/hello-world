package com.codility;

import java.util.HashSet;

public class FrogRiverOne {

	public int frogRiverOne(int X, int[] A) {
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int i = 0 ; i < A.length; i++) {
			if (A[i] <= X)
				hset.add(A[i]);   
			if (hset.size() == X)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {

		FrogRiverOne bg = new FrogRiverOne();
		int[] input = {1,3,1,4,2,3,5,4};
		int binaryGap = bg.frogRiverOne(5, input);
		System.out.println(binaryGap);
	}

}

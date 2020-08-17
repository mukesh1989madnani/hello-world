package com.codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurance {
	
	public int oddOccurance(int[] A) {
		HashMap<Integer, Integer> frequencyMap = new HashMap<>();
		int oddElement = 0;
		if(A.length > 0 && A.length < 1_000_000){
			for(int ctr=0; ctr < A.length; ctr++){
				if(frequencyMap.containsKey(A[ctr])){
					frequencyMap.put(A[ctr], frequencyMap.get(A[ctr]) + 1);
				} else {
					frequencyMap.put(A[ctr], 1);
				}
			}
			for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
				if(entry.getValue() % 2 != 0){
					oddElement = entry.getKey();
					break;
				}
			}
		}
		return oddElement;
	}
	
	public static void main(String[] args) {

		OddOccurance bg = new OddOccurance();
		int[] input = {9,3,9,3,9,7,9};
		int output = bg.oddOccurance(input);
		System.out.println(output);
	}

}

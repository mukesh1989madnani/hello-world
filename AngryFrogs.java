package com.codility;

import java.util.ArrayList;
import java.util.Collections;

public class AngryFrogs {

	public static int solution (int[] block){
		int N = block.length;
	    ArrayList<Integer> countList = new ArrayList<>();
	    for (int i=0; i< N-1; i++) {
	    	boolean ahead = true, behind = true;
	    	int count = 0;
	    	for(int j=i; j< N-1; j++) {
	    		if(ahead && block[j] <= block[j+1]) {
	    			count++;
	    		} else {
	    			ahead = false;
	    		}	    		
	    	}
	    	for(int j=1; j<=i ;j++) {
	    		if(behind && block[i-j+1] <= block[i-j]) {
	    			count++;
	    		} else {
	    			behind = false;
	    		}
	    	}
	    	countList.add(count);
	    }
	    return Collections.max(countList)+1;
	}
	
	public static void main(String[] args) {
		int[] block = {1,1};
		int output = AngryFrogs.solution(block);
		System.out.println(output);
	}

}

package com.codility;

import java.util.ArrayList;

public class BreakTheChain {

	public static int solution (int[] block){
		int sum = Integer.MAX_VALUE;
		int N = block.length;
		ArrayList<Integer> p = new ArrayList<>();
		ArrayList<Integer> q = new ArrayList<>();
		for(int i=1; i< N-3; i++) {
			p.add(block[i]);
		}
		for(int j=3; j<N-1; j++) {
			q.add(block[j]);
		}
		System.out.println(block.toString());
		System.out.println(p);
		System.out.println(q);
		for(int pint : p) {
			for(int qint : q) {
				if(sum > pint+qint) {
					sum = pint+qint;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] block = {5, 2, 4, 6, 3, 7, 1};
		int output = BreakTheChain.solution(block);
		System.out.println(output);
	}

}

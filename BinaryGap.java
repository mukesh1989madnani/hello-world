package com.codility;

public class BinaryGap {

	public int binaryGap(int N) {
		int binaryGap = 0;
		boolean found_one = false;
		for (int j = 0; N > 0; N /= 2) {
			if (N % 2 == 0) {
				j++;
			} else {
				if (j > binaryGap && found_one == true){
					binaryGap = j;
				}
				found_one = true;
				j = 0;
			}
		}
		return binaryGap;
	}
	
	public static void main(String[] args) {

		BinaryGap bg = new BinaryGap();
		int binaryGap = bg.binaryGap(13);
		System.out.println(binaryGap);
	}

}

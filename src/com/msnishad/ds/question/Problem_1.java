package com.msnishad.ds.question;

import java.util.HashMap;
import java.util.Map;

//Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

public class Problem_1 {

	static Map<Integer,Boolean> map = new HashMap<>();

	public static void main(String args[]) {
		int[] lstNo = { 10, 15, 3,1 };
		int k = 17;
		System.err.println(checkSum(lstNo, k));
	}
	
	public static boolean checkSum(int[] nums, int k) {
		int diff = 0;
		for(int i : nums) {
			diff = k - i;
			if(diff >= 0) {
				if(!map.isEmpty() && map.get(i) != null) return true;
				else map.put(diff, true);
			}
		}
		return false;
	}

}

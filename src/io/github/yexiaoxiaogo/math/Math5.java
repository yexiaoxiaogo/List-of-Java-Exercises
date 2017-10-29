package io.github.yexiaoxiaogo.math;

import java.util.HashSet;
import java.util.Set;

public class Math5 {
	public static void main(String[] args) {
		int[] num = new int[] {-1,1,2,2,3,3,4,5};
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<num.length;i++){
			int n = Math.abs(num[i]);
			set.add(n);
		}
		count = set.size();
		System.out.println(set);
		System.out.println(count);
		
	}

}

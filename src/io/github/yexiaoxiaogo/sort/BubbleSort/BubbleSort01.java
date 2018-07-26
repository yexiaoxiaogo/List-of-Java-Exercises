package io.github.yexiaoxiaogo.sort.BubbleSort;

import java.util.Arrays;

public class BubbleSort01 {
	
	private static void sort(int array[]) {
		int tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if (array[j]>array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int[] array = new int [] {2,7,4,8,4,6,9};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}

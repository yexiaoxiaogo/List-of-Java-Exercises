package io.github.yexiaoxiaogo.sort.BubbleSort;

import java.util.Arrays;

public class BubbleSort03 {

	private static void sort(int array[]) {
		
		int tmp = 0;
		// 记录最后一次交换的位置，后面没有交换，说明后面已经是有序的了，不需要再比较
		int lastExchangIndex = 0;
		// 无序数列的边界，每次只需要交换到边界即可，后面的有序不要比较
		int sortBorder = array.length-1;
		
		for (int i = 0; i < array.length; i++) {
			// 有序标记，通过是否有元素交换来判断数组是否已经有序
			boolean isSorted = true;
			for(int j=0;j<array.length-i-1;j++) {
				if (array[j]>array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
					isSorted = false;
					lastExchangIndex = j;
				}
			}
			sortBorder = lastExchangIndex;
			if (isSorted) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = new int [] {2,7,4,8,4,6,9};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}

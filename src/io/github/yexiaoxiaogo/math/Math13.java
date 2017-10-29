package io.github.yexiaoxiaogo.math;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Math13 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		int d = in.nextInt();
		in.close();
		String b = Integer.toBinaryString(d);
		System.out.println("转换为二进制数："+b);
		int count = 0;
		int max = 0;
		for(int i=0;i<b.length();i++){
			if(b.charAt(i)=='0'){
				count++;
			}else {
				max =max>count? max :count;
				count =0;
			}
			System.out.println("i:" + i + " max:" + max + " count:" + count);
			
		}

		System.out.println("最长连续0的个数："+max);
	}

}

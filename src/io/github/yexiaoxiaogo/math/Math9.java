package io.github.yexiaoxiaogo.math;

import java.util.Scanner;

public class Math9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个float数：");
		float f = in.nextFloat();
		in.close();
		System.out.println(Math.abs(f));
	}

}

package io.github.yexiaoxiaogo.math;

import java.util.Scanner;

public class Math3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		double d = in.nextDouble();
		if (d % 1 == 0) {
			System.out.println(d + "is not a double number");
		} else {
			System.out.println(d + "is a double number");
		}
		in.close();
	}
}

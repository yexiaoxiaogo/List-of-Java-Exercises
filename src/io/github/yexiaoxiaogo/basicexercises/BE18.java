package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("input first binary number:");
		int num1 = in.nextInt(2);
		System.out.printf("input second binary number:");
		int num2 = in.nextInt(2);
		in.close();
		System.out.println("两个二进制数相乘结果："+Integer.toBinaryString(num1 * num2));

	}
}

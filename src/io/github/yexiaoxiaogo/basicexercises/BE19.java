package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		int num = in.nextInt();
		System.out.println("转变成二进制数为：" + Integer.toBinaryString(num));

	}
}

package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		int num = in.nextInt();
		in.close();
		System.out.println("转变成16进制数：" + Integer.toHexString(num));

	}
}

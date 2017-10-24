package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入二进制数：");
		int num = in.nextInt(2);
		in.close();
		System.out.println("输出十六进制数：" + Integer.toHexString(num));
	}
}

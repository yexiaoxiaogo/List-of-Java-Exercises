package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入16进制数：");
		int num = in.nextInt(16);
		in.close();
		System.out.println("输出10进制数：" + num);
	}
}

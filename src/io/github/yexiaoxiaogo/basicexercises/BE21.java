package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE21 {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		int num = inScanner.nextInt();
		inScanner.close();
		System.out.println("转变为8进制数：" + Integer.toOctalString(num));

	}
}

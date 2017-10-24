package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE26 {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("输入8进制数：");
		int num = inScanner.nextInt(8);
		inScanner.close();
		System.out.println("输出二进制数:" + Integer.toBinaryString(num));

	}
}

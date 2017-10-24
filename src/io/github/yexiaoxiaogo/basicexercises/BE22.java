package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE22 {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("输入二进制数：");
		int num = inScanner.nextInt(2);
		inScanner.close();
		System.out.println("转变为十进制数："+num);
	}
}

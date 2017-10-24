package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE12 {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.println("输入第一个数：");
		int a = inScanner.nextInt();

		System.out.println("输入第二个数：");
		int b = inScanner.nextInt();

		System.out.println("输入第三个数：");
		int c = inScanner.nextInt();

		System.out.println("average = " + ((a + b + c) / 3));
		
		inScanner.close();

	}
}

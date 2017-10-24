package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE33 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input an integer:");
		int num = in.nextInt();
		in.close();
		int a = num / 10;
		int b = num % 10;
		System.out.println("the sum of the digits is:" + (a + b));
	}
}

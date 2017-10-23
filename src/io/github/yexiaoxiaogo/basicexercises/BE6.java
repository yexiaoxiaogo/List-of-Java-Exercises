package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE6 {
	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		System.out.println("input first number:");
		int num1 = inScanner.nextInt();
		System.out.println("input second number:");
		int num2 = inScanner.nextInt();
		System.out.println(num1+"+"+num2+"="+(num1+num2));
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		inScanner.close();
	}
}

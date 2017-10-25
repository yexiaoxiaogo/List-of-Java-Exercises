package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT3 {
	public static void main(String[] args) {
		System.out.printf("输入一个0-1000之间的整数：");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		String str = String.valueOf(num);
		int len = str.length();
		if (len == 1) {
			System.out.println("the sum of all digits in" + num + "is" + num);
		}
		if (len == 2) {
			int a = num / 10;
			int b = num % 10;
			System.out.println("the sum of all digits in" + num + "is" + (a + b));
		}
		if (len == 3) {
			int a = num / 100;
			int b = (num - (a * 100)) / 10;
			int c = (num - (a * 100)) % 10;
			System.out.println("the sum of all digits in" + num + "is" + (a + b + c));
		}
		if (len == 4) {
			System.out.println("the sum of all digits in " + num + " is " + 1);
		}
	}

}

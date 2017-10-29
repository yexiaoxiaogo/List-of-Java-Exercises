package io.github.yexiaoxiaogo.math;

import java.util.Scanner;

public class Math11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input first number:");
		int first = in.nextInt();
		System.out.println("input second number:");
		int second = in.nextInt();
		in.close();
		int sum = first + second;
		int dif = Math.abs(first - second);
		if (first == 15 || second == 15 || sum == 15 || dif == 15) {
			System.out.println("true");
		} else {
			System.out.println("false");

		}
	}

}

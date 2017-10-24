package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE34 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("input the length of a side of the hexagon:");
		int s = in.nextInt();
		in.close();

		double a = (6 * s * s) / (4 * Math.tan(Math.PI / 6));
		System.out.println("the area of the hexagon is:" + a);
	}
}

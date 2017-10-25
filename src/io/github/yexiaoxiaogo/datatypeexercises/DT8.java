package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the side length value: ");
		double val = in.nextDouble();
		in.close();
		System.out.println("Square: " + Math.pow(val, 2));
		System.out.println("Square: " + Math.pow(val, 3));
		System.out.println("Fourth power:" + Math.pow(val, 4));

	}

}

package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE5 {
	public static void main(String[] args) {
		System.out.println("input first number:");
		Scanner inScanner = new Scanner(System.in);
		int nub1 = inScanner.nextInt();
		System.out.println("input second number:");
		int nub2 = inScanner.nextInt();
		System.out.println(nub1 + nub2);
		System.out.println("输入8进制数：");
		int nub3 = inScanner.nextInt(8);
		System.out.println(nub3);
		inScanner.close();
	}
}

package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT1 {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		System.out.printf("输入华摄度温度:");
		double f = inScanner.nextInt();
		inScanner.close();
		double c = (5 * (f - 32)) / 9;
		System.out.printf("%.1f 华摄度转换成摄氏度等于 %.1f摄氏度", f, c);
	}
}

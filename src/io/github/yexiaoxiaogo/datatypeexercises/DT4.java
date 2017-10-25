package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT4 {
	public static void main(String[] args) {
		System.out.println("输入分钟数：");
		Scanner in = new Scanner(System.in);
		long min = in.nextLong();
		in.close();
		long hour = min/60;
		long temp = hour/24;
		int year = (int) (temp/365);
		int day = (int) (temp%365);
		System.out.println(min+" minutes is approximately "+year+" years and "+day+" days");
	}

}

package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入8进制数：");
		int num = in.nextInt(8);
		in.close();
		System.out.println("输出十进制数：" + num);
	}
}

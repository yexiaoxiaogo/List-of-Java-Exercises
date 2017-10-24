package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE117 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.printf("输入一个正数：");
	int num = in.nextInt();
	in.close();
	int s = (int) Math.sqrt(num);
	System.out.println(num+"的平方根是:"+s);
}
}

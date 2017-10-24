package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE115 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入一串数字：");
		long num = in.nextLong();
		in.close();
		String str = String.valueOf(num);
		System.out.println(num+"是否为回文数字？");
		System.out.println(chack(str));

	}
	private static boolean chack(String str) {
		int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;

	}
}

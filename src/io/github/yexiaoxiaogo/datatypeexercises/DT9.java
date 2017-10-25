package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();
        in.close(); 
        System.out.printf("加: %d%n", firstInt + secondInt);
        System.out.printf("减: %d%n", firstInt - secondInt);
        System.out.printf("乘: %d%n", firstInt * secondInt);
        System.out.printf("平均值: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("绝对值: %d%n", Math.abs(firstInt - secondInt));
        System.out.printf("最大值: %d%n", Math.max(firstInt, secondInt));
        System.out.printf("最小值: %d%n", Math.min(firstInt, secondInt));
	}

}

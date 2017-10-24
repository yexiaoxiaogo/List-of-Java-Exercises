package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("input first number:");
		int num1 = in.nextInt();
		System.out.printf("input second number:");
		int num2 = in.nextInt();
		in.close();
		System.out.println("num1 = " + num1 + ",num2 = " + num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("swap two number:num1 = "+num1+",num2 = "+num2);
		
	}
}

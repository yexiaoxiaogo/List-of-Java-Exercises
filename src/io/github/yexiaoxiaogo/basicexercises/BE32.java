package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE32 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.printf("input first number:");
	int num1 = in.nextInt();
	System.out.printf("input second number:");
	int num2 = in.nextInt();
	in.close();
	if(num1 != num2){
		System.out.println(num1+"!="+num2);
		if(num1-num2>0){
			System.out.println(num1+">"+num2);
		}else {
			System.out.println(num1+"<"+num2);
		}
		if(num1 >=num2){
			System.out.println(num1+">="+num2);
		}else {
			System.out.println(num1+"<="+num2);
		}
	}else {
		System.out.println(num1+"=="+num2);
	}
}
}

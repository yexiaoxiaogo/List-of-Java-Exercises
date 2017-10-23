package io.github.yexiaoxiaogo.basicexercises;

import java.util.Scanner;

public class BE7 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("input a number:");
		int num = in.nextInt();
		for(int i=0;i<10;i++){
			System.out.println(num+"x"+(i+1)+"="+(num*(i+1)));
		}
		in.close();
	}
}

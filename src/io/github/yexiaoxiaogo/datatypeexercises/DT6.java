package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入身高（米）");
		float m = in.nextFloat();
		System.out.println("输入体重（千克）");
		float kg = in.nextFloat();
		float BMI = kg / (m * m);
		System.out.println("Body Mass Index is " + BMI);
	}

}

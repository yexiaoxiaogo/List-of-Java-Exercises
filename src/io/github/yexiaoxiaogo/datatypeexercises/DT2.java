package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT2 {
	public static void main(String[] args) {
		System.out.printf("input a value for inch:");
		Scanner in = new Scanner(System.in);
		float inch = in.nextFloat();
		in.close();
		float meter = (float) (0.0254 * inch);
		System.out.printf("%.1f inch is %.1f meters", inch, meter);

	}
}

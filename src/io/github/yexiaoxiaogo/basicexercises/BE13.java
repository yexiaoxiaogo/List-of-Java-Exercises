package io.github.yexiaoxiaogo.basicexercises;

public class BE13 {
	public static void main(String[] args) {
		double width = 5.6;
		double height = 8.5;
		double a = width * height;
		double p = 2 * (width + height);
		System.out.printf("Area is %.1f*%.1f=%.2f\n", width, height, a);
		System.out.printf("Perimeter is 2*(%.1f+%.1f)=%.2f\n", width, height, p);

	}
}

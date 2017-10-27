package io.github.yexiaoxiaogo.string;

public class String9 {
	public static void main(String[] args) {
		String str1 = "yexiaoxiao";
		String str2 = "xiao";
		String str3 = "abc";
		String str4 = "yexiaoxiao";
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals(str3));
		System.out.println(str1.contentEquals(str4));
		System.out.println(str1.equals(str4));
	}
}

package io.github.yexiaoxiaogo.string;

public class String2 {
public static void main(String[] args) {
	String string = "hni你1";
	System.out.println(string.codePointAt(0));
	System.out.println(string.codePointAt(3));
	System.out.println(string.substring(0, 2));
	System.out.println(string.charAt(2));
	System.out.println(string.codePointCount(0, 2));
}
}

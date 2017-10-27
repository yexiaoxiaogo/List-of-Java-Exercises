package io.github.yexiaoxiaogo.string;

public class String10 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "str";
		StringBuffer stringBuffer = new StringBuffer(str1);
		System.out.println(str1.contentEquals(stringBuffer));
		System.out.println(str2.contentEquals(stringBuffer));
	}

}

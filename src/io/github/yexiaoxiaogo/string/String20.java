package io.github.yexiaoxiaogo.string;

public class String20 {
	public static void main(String[] args) {
		String str1 = "yexiaoxiao";
		String str2 = "ye";
		String str3 = "xiaoxiao";
		String str4 = str2+str3;
		String str5 =str4.intern();
		System.out.println(str1==str4);
		System.out.println(str1==str5);
	}

}

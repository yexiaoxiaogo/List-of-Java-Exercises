package io.github.yexiaoxiaogo.string;

public class String5 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "ABC";
		int num1 = str1.compareTo(str2);
		if (num1 > 0) {
			System.out.println(str1 + ">" + str2);
		} else if (num1 == 0) {
			System.out.println(str1 + "=" + str2);
		}
		else{
			System.out.println(str1 + "<" + str2);
		}

	}

}

package io.github.yexiaoxiaogo.string;

public class String16 {
	public static void main(String[] args) {
		String str = "yexiaoxiao";
		byte[] bytearr = str.getBytes();
		String newstr = new String(bytearr);
		System.out.println(newstr);
	}

}

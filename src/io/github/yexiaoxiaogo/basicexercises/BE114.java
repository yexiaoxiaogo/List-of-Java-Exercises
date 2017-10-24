package io.github.yexiaoxiaogo.basicexercises;

public class BE114 {

	
	public static void main(String[] args) {
		String str = "123456789";
		int offset = 3;
		String reString = 
				str.substring(str.length() - offset, str.length())
				+ str.substring(0, str.length() - offset);
		System.out.println(reString);

	}

}

package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArryList14 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		System.out.println(list1);
		for (String a : list1) {
			System.out.println(a);
		}
		Collections.swap(list1, 0, 4);
		System.out.println(list1);
		for (String b : list1) {
			System.out.println(b);
		}
	}

}

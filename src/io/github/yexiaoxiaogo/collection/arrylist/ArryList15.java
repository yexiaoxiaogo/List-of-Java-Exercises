package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.List;

public class ArryList15 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("ab");
		list2.add("123");
		System.out.println(list1);
		System.out.println(list2);
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.addAll(list1);
		arrayList.addAll(list2);
		System.out.println(arrayList);
	}

}

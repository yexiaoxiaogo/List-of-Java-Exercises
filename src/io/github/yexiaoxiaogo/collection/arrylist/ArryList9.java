package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArryList9 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		System.out.println("list1:"+list1);
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		System.out.println("list2:"+list2);
		Collections.copy(list1, list2);
		System.out.println("list1"+list1);
	}

}

package io.github.yexiaoxiaogo.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<>();
		List<String> list = new LinkedList<>();
		linkedlist.add("a");
		linkedlist.add("a");
		linkedlist.add("a");
		linkedlist.add("a");
		linkedlist.add("a");

		list.add("b");
		list.add("b");
		list.add("b");
		list.add("b");

		System.out.println("linkedlist1:" + linkedlist);
		System.out.println("linkedlist2:" + list);
	}

}

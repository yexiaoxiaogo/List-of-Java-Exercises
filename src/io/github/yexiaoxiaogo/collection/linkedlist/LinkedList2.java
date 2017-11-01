package io.github.yexiaoxiaogo.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {
	public static void main(String[] args) {
		List<String> linkedlist = new LinkedList<>();
		linkedlist.add("abc");
		linkedlist.add("abc");
		linkedlist.add("abc");
		linkedlist.add("abc");
		for (String x : linkedlist) {
			System.out.println(x); 
		}
	}

}

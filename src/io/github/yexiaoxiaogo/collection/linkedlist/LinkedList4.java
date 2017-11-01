package io.github.yexiaoxiaogo.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		linkedlist.add("d");
		Iterator<String> des = linkedlist.descendingIterator();//这个一定要声明linkedlisted类型
		while (des.hasNext()) {
			System.out.println(des.next());
		}
	}

}

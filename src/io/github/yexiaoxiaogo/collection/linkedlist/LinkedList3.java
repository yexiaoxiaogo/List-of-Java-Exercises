package io.github.yexiaoxiaogo.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList3 {
	public static void main(String[] args) {
		List<String> linkedlist = new LinkedList<>();
		linkedlist.add("a");
		linkedlist.add("b");
		linkedlist.add("c");
		linkedlist.add("d");
		Iterator<String> p = linkedlist.listIterator(1);
		while (p.hasNext()) {
			System.out.println(p.next());
		}

	}

}

package io.github.yexiaoxiaogo.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1_4 {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.add("a");
		hashset.add("b");
		hashset.add("c");
		hashset.add("d");
		hashset.add("e");
		System.out.println(hashset);
		// 2 Iterator set
		Iterator<String> p = hashset.iterator();
		while (p.hasNext()) {
			System.out.println(p.next());
		}
		// 3 hashset size
		System.out.println(hashset.size());
		// 4
		hashset.removeAll(hashset);
		System.out.println(hashset);
	}
}

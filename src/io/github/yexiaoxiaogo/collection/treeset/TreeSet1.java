package io.github.yexiaoxiaogo.collection.treeset;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("a");
		treeSet.add("b");
		treeSet.add("c");
		treeSet.add("d");
		treeSet.add("e");
		System.out.println("TreeSet:" + treeSet);
		for(String x : treeSet){
			System.out.println(x);
		}
	}

}

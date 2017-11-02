package io.github.yexiaoxiaogo.collection.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "a");
		treeMap.put(2, "b");
		treeMap.put(3, "c");
		treeMap.put(4, "d");
		treeMap.put(5, "e");
		for (Map.Entry<Integer, String> x : treeMap.entrySet()) {
			System.out.println(x.getKey() + ":" + x.getValue());
		}

	}

}

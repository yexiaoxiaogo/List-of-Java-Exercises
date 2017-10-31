package io.github.yexiaoxiaogo.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1_2 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "a");
		hashMap.put(2, "b");
		hashMap.put(3, "c");
		hashMap.put(4, "d");
		hashMap.put(5, "e");
		for (Map.Entry x : hashMap.entrySet()) {
			System.out.println(x.getKey() + ":" + x.getValue());
		}
		// 2
		int size = hashMap.size();
		System.out.println("hashmap size:" + size);
	}

}

package io.github.yexiaoxiaogo.collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMap7_12 {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("a", 1);
		hashMap.put("b", 2);
		hashMap.put("c", 3);
		hashMap.put("d", 4);
		System.out.println("hashmap:" + hashMap);
		System.out.println("is key 'a' exists?");
		if (hashMap.containsKey("a")) {
			System.out.println("yes  and value is " + hashMap.get("a"));
		} else {
			System.out.println("no");
		}
		// 8
		System.out.println("is value '9' extis?");
		if (hashMap.containsValue(9)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		// 9
		Set set = hashMap.entrySet();
		System.out.println("set:" + set);
		// 10
		int value = hashMap.get("a");
		System.out.println("key a 的value是:" + value);
		// 11 hashmap 的key的set是
		Set keyset = hashMap.keySet();
		System.out.println("key set:" + keyset);
		// 12 hashmap的value的set是
		System.out.println("value set:" + hashMap.values());

	}

}

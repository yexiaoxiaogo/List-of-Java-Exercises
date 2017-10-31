package io.github.yexiaoxiaogo.collection.hashmap;

import java.util.HashMap;

public class HashMap3_6 {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap1 = new HashMap<>();
		HashMap<Integer, String> hashmap2 = new HashMap<>();
		hashmap1.put(1, "a");
		hashmap1.put(2, "b");
		hashmap1.put(3, "c");
		System.out.println("hashmap1:" + hashmap1);
		hashmap2.put(4, "d");
		hashmap2.put(5, "e");
		hashmap2.put(6, "f");
		System.out.println("hashmap2:" + hashmap2);
		hashmap2.putAll(hashmap1);
		System.out.println("hashmap1:" + hashmap1);
		System.out.println("hashmap2:" + hashmap2);
		//4
		hashmap1.clear();
		System.out.println("after clear() hashmap1:"+hashmap1);
		//5
		System.out.println("hashmap1 is empty?:"+hashmap1.isEmpty());
		System.out.println("hashmap2 is empty?:"+hashmap2.isEmpty());
		//6
		HashMap<Integer,String> clonemap = new HashMap<>();
		clonemap= (HashMap<Integer, String>) hashmap2.clone();
		System.out.println("clonemap:"+clonemap);
		

	}

}

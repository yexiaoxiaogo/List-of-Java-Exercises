package io.github.yexiaoxiaogo.collection.linkedlist;

import java.util.LinkedList;

public class LinkedList5_14 {
	public static void main(String[] args) {
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Original linked list: ");
		System.out.println("Let add the Yellow color after the Red Color: " + l_list);
		l_list.add(1, "yellow");
		System.out.println(l_list);
		// 6
		System.out.println("Let add the first and last: " + l_list);
		l_list.addFirst("a");
		l_list.addLast("b");
		System.out.println(l_list);
		// 10
		System.out.println(l_list.getFirst());
		System.out.println(l_list.getLast());
		// 11
		System.out.println("第11题输出：");
		for (int i = 0; i < l_list.size(); i++) {
			System.out.println("Element at index " + i + ": " + l_list.get(i));
		}
		// 12
		System.out.println("l_list列表：" + l_list);
		l_list.remove(1);
		System.out.println("第十二题remove第二个元素后输出：" + l_list);
		//13 移除第一个和最后一个
		l_list.removeFirst();
		l_list.removeLast();
		System.out.println("移除第一个和最后一个输出list列表："+l_list);
		//14 移除所有
		l_list.removeAll(l_list);
		//也可以用     l_list.clear();
		System.out.println("14题 移除所有元素后list："+l_list);
	}

}

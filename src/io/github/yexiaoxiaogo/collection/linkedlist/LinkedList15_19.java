package io.github.yexiaoxiaogo.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList15_19 {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("orange");
		System.out.println("The Original linked list: " + linkedList);
		// 15
		Collections.swap(linkedList, 0, 1);
		System.out.println("15题，交换第一个和第二个元素的位置后：" + linkedList);
		// 16
		Collections.shuffle(linkedList);
		System.out.println("16t题,洗牌后list顺序：" + linkedList);
		//19
		System.out.println("remove first :"+linkedList.pop());
		System.out.println("after pop:"+linkedList);
	}

}

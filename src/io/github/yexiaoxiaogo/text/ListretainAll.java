package io.github.yexiaoxiaogo.text;

import java.util.ArrayList;
import java.util.List;

public class ListretainAll {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList1 = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		arrayList1.add(1);
		arrayList1.add(2);
		arrayList1.add(3);
//		arrayList2.add(2);
//		arrayList2.add(3);
//		arrayList2.add(4);
		System.out.println("list1:"+arrayList1);
		System.out.println("list2:"+arrayList2);
		List<Integer> temp = new ArrayList<Integer>(arrayList1); 
		temp.retainAll(arrayList2);
		System.out.println("list1:"+arrayList1);
		System.out.println("list1 ∩ list2:"+temp);
		arrayList1.removeAll(temp);
		System.out.println("list1:"+arrayList1);
		System.out.println("list1 remove temp:"+arrayList1);

	}

}

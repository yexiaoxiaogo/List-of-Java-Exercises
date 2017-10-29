package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;

public class ArryList16171819 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		System.out.println("list:"+list);
		//16
		ArrayList<String> newlist = (ArrayList<String>) list.clone();
		System.out.println("clonlist:"+newlist);
		//17
		newlist.removeAll(newlist);
		System.out.println("remove newlist:"+newlist);
		//18
		System.out.println("list是否为空？"+list.isEmpty());
		System.out.println("newlist是否为空？"+newlist.isEmpty());
		//19
		list.trimToSize();
		System.out.println(list);
		
	}

}

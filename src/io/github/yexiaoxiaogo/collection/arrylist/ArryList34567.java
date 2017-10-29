package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.List;

public class ArryList34567 {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<String>();
		stringlist.add("a");
		stringlist.add("b");
		stringlist.add("c");
		stringlist.add("d");
		stringlist.add("e");
		System.out.println(stringlist);
		stringlist.add(0, "1");
		stringlist.add(3, "2");
		System.out.println(stringlist);
		String first = stringlist.get(0);
		String laString = stringlist.get(stringlist.size()-1);
		System.out.println(first);
		System.out.println(laString);
		stringlist.set(0, "A");
		System.out.println(stringlist);
		stringlist.remove(3);
		System.out.println(stringlist);
		if(stringlist.contains("A")){
			System.out.println("found");
		}else {
			System.out.println("not found");
		}
	}

}

package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.List;

public class ArryList2 {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<String>();
		stringlist.add("a");
		stringlist.add("b");
		stringlist.add("c");
		stringlist.add("d");
		for (String element : stringlist) {
			System.out.println(element);
		}
	}

}

package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArryList8 {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<>();
		stringlist.add("b");
		stringlist.add("f");
		stringlist.add("a");
		stringlist.add("d");
		stringlist.add("e");
		stringlist.add("c");
		System.out.println(stringlist);
		Collections.sort(stringlist);
		System.out.println(stringlist);
	}

}

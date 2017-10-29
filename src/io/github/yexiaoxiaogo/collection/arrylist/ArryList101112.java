package io.github.yexiaoxiaogo.collection.arrylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArryList101112 {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<>();
		stringlist.add("a");
		stringlist.add("b");
		stringlist.add("c");
		stringlist.add("d");
		stringlist.add("e");
		System.out.println(stringlist);
		//12
		System.out.println(stringlist.subList(0, 3));
		//11
		Collections.reverse(stringlist);
		System.out.println(stringlist);
		//10
		Collections.shuffle(stringlist);
		System.out.println(stringlist);
	}

}

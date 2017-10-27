package io.github.yexiaoxiaogo.string;

import java.util.HashSet;
import java.util.Set;

public class String19 {
	public static void main(String[] args) {
		String str = "yexiaoxiao";
		Set<Integer> set = new HashSet<Integer>();
		for(int form=0;form<str.length();){
			System.out.println(form);
			int o = str.indexOf("xiao", form);
			if (o>=0) {
				set.add(o);			
			}
			if(o==-1){
				break;
			}
			form =o+1;
		}
		if(!set.isEmpty()){
			System.out.println(set);
		}
	}
}

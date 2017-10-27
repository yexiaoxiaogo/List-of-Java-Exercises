package io.github.yexiaoxiaogo.string;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class String15 {
	public static void main(String[] args) {
		Date date = new Date();
//		Calendar c1 = Calendar.getInstance();
//		System.out.format("%tB %te, %tY%n", c1, c1, c1);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(date));
//		System.out.printf("%tF \n",date);
//		System.out.printf("%tr", date);
		
	}

}

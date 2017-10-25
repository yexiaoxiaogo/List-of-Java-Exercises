package io.github.yexiaoxiaogo.datatypeexercises;

import java.util.Scanner;

public class DT7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.printf("Input distance in meters:");
		float meter = in.nextFloat();
		System.out.printf("Input hour:");
		float hour = in.nextFloat();
		System.out.printf("Input minutes:");
		float min = in.nextFloat();
		System.out.printf("Input seconds:");
		float sec = in.nextFloat();
		in.close();
		float totalsec = (hour*60+min)*60+sec;
		System.out.println(totalsec);
		float a = meter/totalsec;
		float b = (meter/1000)/(totalsec/3600);
		float c = (meter/1609)/(totalsec/3600);
		System.out.println("Your speed in meters/second is " + a);
		System.out.println("Your speed in km/h is"+b);
		System.out.println("Your speed in miles/h is "+c);
	}

}

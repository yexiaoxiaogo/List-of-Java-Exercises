package io.github.yexiaoxiaogo.collection.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Red");
		queue.add("Green");
		queue.add("Orange");
		queue.add("White");
		queue.add("Black");
		System.out.println("Elements of the Priority Queue: ");
		System.out.println(queue);
		for (String x : queue) {
			System.out.println(x);
		}
		System.out.println("看第一个元素："+queue.peek());
	}

}

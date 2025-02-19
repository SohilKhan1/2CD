package Lecture14;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer>ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		ll.add(2,300);
		System.out.println(ll);
		ll.addLast(200);
		System.out.println(ll);
		ll.remove();
		System.out.println(ll);
		ll.remove(2);
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.getLast());
		System.out.println(ll.get(2));
		System.out.println(ll.size());
		System.out.println(ll.contains(2000));
		System.out.println(ll.reversed());
	}

}

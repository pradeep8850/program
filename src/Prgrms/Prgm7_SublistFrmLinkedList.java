package Prgrms;

import java.util.LinkedList;

public class Prgm7_SublistFrmLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		System.out.println("LinkedList contains = "+l1);

		System.out.println("SubList of LinkedList = "+l1.subList(2, 4));
		
	}

}

package Prgrms;

import java.util.LinkedList;

public class Prgm6_LinkedListToArray {

	public static void main(String[] args) {
		
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		System.out.println("LinkedList contains = "+l1);
		
		String []arr=new String[l1.size()];
		l1.toArray(arr);
		System.out.println("Array contains are ");
		for(String str:arr)
		{
			System.out.println(str);
		}
		
	}

}

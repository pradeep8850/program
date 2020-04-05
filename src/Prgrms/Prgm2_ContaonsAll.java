package Prgrms;

import java.util.ArrayList;

public class Prgm2_ContaonsAll {

	public static void main(String[] args) {
		

		ArrayList<String> l1=new ArrayList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		System.out.println("ArrayList1 contains = "+l1);
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("two");
		l2.add("four");
		System.out.println("ArrayList2 contains = "+l1.containsAll(l2));
		

	}

}

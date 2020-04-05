package Prgrms;

import java.util.ArrayList;
import java.util.Collections;

public class Prgm4_ShuffleArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		System.out.println("ArrayList1 contains = "+l1);
		
		Collections.shuffle(l1);
		System.out.println("Shuffled ArrayList = "+l1);
	}

}

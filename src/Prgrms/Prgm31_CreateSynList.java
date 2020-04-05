package Prgrms;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Prgm31_CreateSynList {

	public static void main(String[] args) {
		
		
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		System.out.println("LinkedList contains = "+l1);
	
		//To create synzed list
		List<String> syn = Collections.synchronizedList(l1);
		System.out.println("Synchronized List = "+syn);
	}
}

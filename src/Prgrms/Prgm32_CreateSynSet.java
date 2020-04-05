package Prgrms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Prgm32_CreateSynSet {

	public static void main(String[] args) {
			
			
			HashSet<String> l1=new HashSet<String>();
			l1.add("one");
			l1.add("two");
			l1.add("three");
			l1.add("four");
			l1.add("five");
			
			System.out.println("LinkedList contains = "+l1);
		
			//To create synzed set
			Set<String> syn = Collections.synchronizedSet(l1);
			System.out.println("Synchronized Set = "+syn);
		}
}

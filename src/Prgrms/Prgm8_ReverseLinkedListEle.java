package Prgrms;

import java.util.Collections;
import java.util.LinkedList;

public class Prgm8_ReverseLinkedListEle {

		public static void main(String[] args) {
			
			LinkedList<String> l1=new LinkedList<String>();
			l1.add("one");
			l1.add("two");
			l1.add("three");
			l1.add("four");
			l1.add("five");
			
			System.out.println("LinkedList contains = "+l1);

			Collections.reverse(l1);
			System.out.println("Reverse Order of LinkedList = "+l1);
			
		}
}

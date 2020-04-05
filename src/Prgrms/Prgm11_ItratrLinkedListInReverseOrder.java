package Prgrms;

import java.util.Iterator;
import java.util.LinkedList;

public class Prgm11_ItratrLinkedListInReverseOrder {

		public static void main(String[] args) {
			
			LinkedList<String> l1=new LinkedList<String>();
			l1.add("one");
			l1.add("two");
			l1.add("three");
			l1.add("four");
			l1.add("five");
			
			System.out.println("LinkedList contains = "+l1);

			 Iterator<String> itr=l1.descendingIterator();
			 while(itr.hasNext()){
				 System.out.println(itr.next());
			 }

		}
}

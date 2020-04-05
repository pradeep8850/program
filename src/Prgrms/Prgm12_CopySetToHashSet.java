package Prgrms;

import java.util.HashSet;

public class Prgm12_CopySetToHashSet {

			public static void main(String[] args) {
			
			HashSet<String> s1=new HashSet<String>();
			s1.add("one");
			s1.add("two");
			s1.add("three");
			s1.add("four");
			s1.add("five");
			
			System.out.println("Set1 contains = "+s1);

			HashSet<String> s2=new HashSet<String>();
			s2.add("six");
			s2.add("seven");
			s2.addAll(s1);
			System.out.println("HashSet2 Contains = "+s2);
			
		}
}

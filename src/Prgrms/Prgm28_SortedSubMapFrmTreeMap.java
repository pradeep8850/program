package Prgrms;

import java.util.TreeMap;

public class Prgm28_SortedSubMapFrmTreeMap {

public static void main(String[] args) {
		
		
		TreeMap<Integer,String> m1=new TreeMap<Integer,String>();
		m1.put(10,"one");
		m1.put(20,"two");
		m1.put(30,"three");
		m1.put(40,"two");
		m1.put(50,"five");
		
		System.out.println("TreeMap contains = "+m1);

		System.out.println("Sorted SubMap from TreeMap = "+m1.subMap(20,40));
	  
	}
}

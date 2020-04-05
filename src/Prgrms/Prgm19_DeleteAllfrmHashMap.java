package Prgrms;

import java.util.HashMap;


public class Prgm19_DeleteAllfrmHashMap {

public static void main(String[] args) {
		
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(10,"one");
		m1.put(20,"two");
		m1.put(30,"three");
		m1.put(40,"two");
		m1.put(50,"five");
		
		System.out.println("Map contains = "+m1);

		m1.clear();
		System.out.println("Deleted all the elements in Maps = "+m1);
		
	}	
}

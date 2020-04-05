package Prgrms;

import java.util.HashMap;
import java.util.Set;

public class Prgm17_AllKeysInHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(10,"one");
		m1.put(20,"two");
		m1.put(30,"three");
		m1.put(40,"two");
		m1.put(50,"five");
		
		System.out.println("Map contains = "+m1);

		Set<Integer> key = m1.keySet();
		System.out.println("Keys are = "+key);
	}
}

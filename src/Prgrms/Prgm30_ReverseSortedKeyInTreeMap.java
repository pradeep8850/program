package Prgrms;

import java.util.Collections;
import java.util.TreeMap;

public class Prgm30_ReverseSortedKeyInTreeMap {

	public static void main(String[] args) {
			
			
			TreeMap<Integer,String> m1=new TreeMap<Integer,String>(Collections.reverseOrder());
			m1.put(10,"one");
			m1.put(20,"two");
			m1.put(30,"three");
			m1.put(40,"two");
			m1.put(50,"five");
			
			System.out.println("TreeMap contains = "+m1);
	}
}

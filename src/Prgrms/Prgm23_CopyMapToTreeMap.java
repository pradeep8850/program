package Prgrms;

import java.util.HashMap;
import java.util.TreeMap;

public class Prgm23_CopyMapToTreeMap {

	public static void main(String[] args) {
		
		//Map(Key,Value)  if key is duplicate it will overlap new value
		HashMap<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(10,"one");
		m1.put(20,"two");
		m1.put(30,"three");
		m1.put(40,"two");
		m1.put(50,"five");
		
		System.out.println("Map contains = "+m1);

		TreeMap<Integer,String> m2=new TreeMap<Integer,String>(m1);
			
		System.out.println("Tree Map contains = "+m2);
	  
	}
	
}

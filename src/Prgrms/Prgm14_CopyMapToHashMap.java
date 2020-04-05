package Prgrms;

import java.util.HashMap;

public class Prgm14_CopyMapToHashMap {

public static void main(String[] args) {
		
	//Map(Key,Value)  if key is duplicate it will overlap new value
	HashMap<Integer,String> m1=new HashMap<Integer,String>();
	m1.put(10,"one");
	m1.put(20,"two");
	m1.put(30,"three");
	m1.put(10,"two");
	m1.put(50,"five");
	
	System.out.println("Map contains = "+m1);

	HashMap<Integer,String> m2=new HashMap<Integer,String>(m1);
		
	System.out.println("Map2 contains = "+m2);
  
	}
}

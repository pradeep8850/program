package Prgrms;

import java.util.Scanner;
import java.util.TreeMap;

public class Prgm25_SearchValueInTreeMap {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> m1=new TreeMap<Integer,String>();
		m1.put(10,"one");
		m1.put(20,"two");
		m1.put(30,"three");
		m1.put(40,"two");
		m1.put(50,"five");
		
		System.out.println("Map contains = "+m1);

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Key");
		int key=sc.nextInt();
		sc.close();
		System.out.println("key = "+key+" value = "+m1.get(key));
	  
	}
}

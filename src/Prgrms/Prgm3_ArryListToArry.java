package Prgrms;

import java.util.ArrayList;

public class Prgm3_ArryListToArry {

	public static void main(String[] args) {
		
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("one");
		l1.add("two");
		l1.add("three");
		l1.add("four");
		l1.add("five");
		
		System.out.println("ArrayList1 contains = "+l1);
		
		String []arr=new String[l1.size()];
		l1.toArray(arr);
		
		System.out.println("Array Contains = ");
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}

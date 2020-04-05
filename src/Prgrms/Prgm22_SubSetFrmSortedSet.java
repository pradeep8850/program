package Prgrms;

import java.util.TreeSet;

public class Prgm22_SubSetFrmSortedSet {

	public static void main(String[] args)
	{
		TreeSet<Integer> t1=new TreeSet<>();
		t1.add(60);
		t1.add(10);
		t1.add(40);
		t1.add(20);
		t1.add(30);
		
		System.out.println("Tree Set Contains = "+t1);
		
		System.out.println("SubSet of TreeSet = "+t1.subSet(20, 50));
	}
}

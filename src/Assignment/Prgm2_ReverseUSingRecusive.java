package Assignment;

import java.util.Scanner;

public class Prgm2_ReverseUSingRecusive {

	public static String reverse(String str){
		if(str.isEmpty())
		{
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		String s1=sc.next();
		sc.close();
		String rc = reverse(s1);
		System.out.println("Reversed String = "+rc);
	}

}

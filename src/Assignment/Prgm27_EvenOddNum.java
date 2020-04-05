package Assignment;

import java.util.Scanner;

public class Prgm27_EvenOddNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 no's = ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3=sc.nextInt();
		sc.close();
		
		if(n1%2==0)
		{
			System.out.println("Even Num = "+n1);
		}
		else
		{
			System.out.println("Odd Num = "+n1);
		}
		if(n2%2==0)
		{
			System.out.println("Even Num = "+n2);
		}
		else
		{
			System.out.println("Odd Num = "+n2);
		}
		if(n3%2==0)
		{
			System.out.println("Even Num = "+n3);
		}
		else
		{
			System.out.println("Odd Num = "+n3);
		}
		
	}

}

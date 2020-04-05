package Assignment;

import java.util.Scanner;

public class Prgm22_BigestNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no's = ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		
		sc.close();
		if(n1>n2)
		{
			System.out.println(n1+" is greater no");
		}else
		{
			System.out.println(n2+" is greater no");
		}
	}

}

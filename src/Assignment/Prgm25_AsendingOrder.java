package Assignment;

import java.util.Scanner;

public class Prgm25_AsendingOrder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 no's = ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3=sc.nextInt();
		sc.close();
		
		if ((n1 < n2) && (n2 < n3))
		{
		    System.out.println("Asending Order = " + n1 + " " + n2 + " " + n3);
		}
		else if ((n1 < n2) && (n2 > n3))
		{
			System.out.println("Asending Order = " + n1 + " " + n3 + " " + n2);
		}
		else if ((n1 > n2) && (n2 > n3))
		{
			System.out.println("Asending Order = " + n3 + " " + n2 + " " + n1);
		}
		else if ((n1 > n2) && (n2 < n3))
		{
			System.out.println("Asending Order = " + n2 + " " + n1 + " " + n3);
		}

	}

}

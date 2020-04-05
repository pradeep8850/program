package Assignment;

import java.util.Scanner;

public class Prgm23_SmallrNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 no's = ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3=sc.nextInt();
		sc.close();
		if(n1<n2 && n1<n3)
		{
			System.out.println(n1+" is Smaller no");
		}else if(n2<n1 && n2<n3)
		{
			System.out.println(n2+" is Smaller no");
		}else
		{
			System.out.println(n3+" is Smaller no");
		}

	}

}

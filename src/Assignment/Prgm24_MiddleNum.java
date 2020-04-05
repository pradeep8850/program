package Assignment;

import java.util.Scanner;

public class Prgm24_MiddleNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 no's = ");
		int n1 = sc.nextInt();
		int n2= sc.nextInt();
		int n3=sc.nextInt();
		sc.close();
		
		if(n2>n1 && n1>n3 || n3>n1 && n1>n2){
	        System.out.print(n1+" is a middle number");
	    }
	   
	    if(n1>n2 && n2>n3 || n3>n2 && n2>n1){
	        System.out.print(n2+" is a middle number");
	    }

	    if(n1>n3 && n3>n2 || n2>n3 && n3>n1){
	        System.out.print(n3+" is a middle number");
	    }


	}

}

package Assignment;

import java.util.Scanner;

public class Prgm9 {

		       	    
		    public static void main(String[] args) {
		  
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the String = ");
		        String str = sc.nextLine();
		        sc.close();
//		        String result = reverseWordsInString(str);
//		        print("Result String is "+result);
		        
		        String[] strarr = str.split(" ");
		    	
		        StringBuilder sb = new StringBuilder();
	
		        for (String word : strarr) {
		            if (!word.equals(" ")) {
		            
		                StringBuilder sb1 = new StringBuilder(word);
		             
		                String reverseString = sb1.reverse().toString();
	
		                sb.append(reverseString + " ");
		            }
		        }
		    }
		
}

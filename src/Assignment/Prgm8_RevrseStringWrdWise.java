package Assignment;

public class Prgm8_RevrseStringWrdWise {

	public static void main(String[] args) {
		
		String s1 = "hi hello how are you";
		StringBuilder rvsstng = new StringBuilder();
		 
		String[] wrds = s1.split(" ");       
		 
		for (String word : wrds) 
		{
		    String revrswrd = new StringBuilder(word).reverse().toString();     
		    rvsstng.append(revrswrd + " ");                                
		}
		 
		System.out.println( rvsstng.toString().trim() );

	}

}

package Assignment;

public class Prgm3_HalfSeparateConcat {

	public static void main(String[] args) {
		
		String s1="pradeepsharma";
		System.out.println("String = "+s1);
		
		String str1="";
		String str2="";
		for(int i=s1.length()/2;i>=0;i--)
		{
			str1=str1+s1.charAt(i);
		}
		System.out.println("1st Half = "+str1);
		
		for(int i=s1.length()-1;i>s1.length()/2;i--)
		{
			str2=str2+s1.charAt(i);
		}
		System.out.println("2nd Half = "+str2);
		
		System.out.println("Concat 2 Reverse String = "+str1+str2);

	}

	
}

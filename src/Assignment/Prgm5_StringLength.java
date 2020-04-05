package Assignment;

public class Prgm5_StringLength {

	public static void main(String[] args) {
		String s1="Shweta";
		
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
//			s1.charAt(i);
			count++;
		}
		System.out.println("length of the string = "+count);
	}

}

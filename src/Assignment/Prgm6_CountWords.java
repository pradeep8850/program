package Assignment;

public class Prgm6_CountWords {

	public static void main(String[] args) {

		String s1="hi hello gm";
		String [] s2=s1.split(" ");
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			count++;
		}
		System.out.println("Words present string = "+count);

	}

}

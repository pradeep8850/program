package Assignment;

public class Prgm38_Pattrn {

	public static void main(String[] args) {
		
		int count=1;
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			int rev=count+n-1;
			for(int j=0;j<i;j++)
			{				
				System.out.print(rev--);
				n++;
			}
			count++;
			System.out.println();
		}

	}

}

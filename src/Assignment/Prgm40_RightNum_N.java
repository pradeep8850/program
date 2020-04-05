package Assignment;

public class Prgm40_RightNum_N {

	public static void main(String[] args) {
		
		int star=1;
		int space=3;
		int n=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(n);
				++n;
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			space--;
			star++;
			System.out.println();
		}

	}

}

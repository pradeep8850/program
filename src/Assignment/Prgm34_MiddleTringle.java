package Assignment;

public class Prgm34_MiddleTringle {

	public static void main(String[] args) {

		int star=1;
		int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			space--;
			star++;
			System.out.println();
		}

		
	}

}

package day3;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
					System.out.print(" ");
			if(i==5)
				i=9;
			for(int j=1;j<=i;j++)	
					System.out.print("*");
					System.out.println();			
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
				System.out.print(" ");
			for(int j=1;j<=5-i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}

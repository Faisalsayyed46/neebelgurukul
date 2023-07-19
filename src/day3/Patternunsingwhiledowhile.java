package day3;

public class Patternunsingwhiledowhile {

	public static void main(String[] args) {
		int i = 1;
		while(i<=5)
		{
			int j=1;
			while(j<=5-i)
			{
				System.out.print(" ");
				j++;
			}
		int k=i;
			while(k>=1)
			{
				System.out.print(k);
				k--;
			}
			j=2;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			
			System.out.println();
			i++;
		}
		
	}
}

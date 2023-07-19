package day3assignment;


public class asign3q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		for(int i=1;i<=6;i++){
			for(int j=6-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(x%10);
				x++;
			}
			System.out.println();
		}

	}
}

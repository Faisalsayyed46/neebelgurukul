package day6;

public class Halfreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,11,12,20,21,22,23};
		
		for(int i=0,j=(a.length+1)/2;j<a.length;i++,j++)
		{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

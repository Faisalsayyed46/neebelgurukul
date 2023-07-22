package day6;

public class Interchangesmallerwithgreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {7,8,11,2,9,14};
		int t=0;
		int n=a.length;
		int small=a[0];
		int big =a[0];
		int s=0;
		int b=0;
		for(int i=0;i<n;i++)	
		{
			if(a[i]<small) {
				small=a[i];
				s=i;}
			if(a[i]>big) {
				big=a[i];
				b=i;
			}
		}
			t=s;
			s=b;
			a=t;

	}

}

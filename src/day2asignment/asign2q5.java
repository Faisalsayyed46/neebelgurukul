package day2asignment;

public class asign2q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,count=0;
		for(int i=1;i<=30;i++) {
			int third=first+second;
			first=second;
			second=third;
			if(third%2==0) {
				System.out.print(third+" ");
				count++;
			}
				if(count>10)
					break;
		}
	}
}

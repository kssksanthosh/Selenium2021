package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int firstnum=0;
		int secnum=1;
		int sum;
		System.out.println(firstnum);
		for(int i=1;i<range;i++)
		{
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}

	}

}

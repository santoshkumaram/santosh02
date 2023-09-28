package Operaters;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=0, a2=1, a3, count=15;
		System.out.print(a1+ " "+ a2);
		for (int i=2; i<count; i++)
		{
			a3= a1 + a2;
			System.out.print(" " + a3);
			a1=a2;
			a2=a3;
		}

	}

}

package com.santosh.demo;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0;
		int i,j;
		for (i=1;i<=20;i++)
		{
			for (j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c=c+1;
				}
			}
				if(c==2)
				{System.out.println("prime number is:"+i);
		}
				c=0;
	
	}

	}

}

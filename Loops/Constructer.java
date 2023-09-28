package Loops;


public class Constructer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Santosh a1=new Santosh();
		a1.banglore();
		Santosh a2=new Santosh(10,30);
		

	}

}
class Santosh{
	Santosh(){
		System.out.println("this is constructer");
	}
	Santosh(int c,int d)
	{System.out.println("The addition of"+c+" and "+d+" is;"+(c+d));
}
	public void banglore() {
		System.out.println("banglore");
	}
	

}

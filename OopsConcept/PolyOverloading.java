package OopsConcept;


class  adder{
	static int add(int a, int b) {return a+b;}
	static int add(int a,int b,int c) {return a+b+c;}
}

public class PolyOverloading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(adder.add(10, 20));
		System.out.println(adder.add(20, 40,60));

	}



}

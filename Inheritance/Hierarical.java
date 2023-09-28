package Inheritance;

public class Hierarical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1=new B();
		obj1.methodA();
		obj1.methodB();
		
		C obj2=new C();
		obj2.methodA();
		obj2.methodC();
		
		D obj3=new D();
		obj3.methodA();
		obj3.methodD();
		
}
}

class A
{public void methodA() {
	System.out.println("method of class A");
}
	
	
}
class B extends A
{public void methodB() {
	System.out.println("method of class B");
}
	
	
}
class C extends A
{public void methodC() {
	System.out.println("method of class C");
}
	
	
}
class D extends A
{public void methodD() {
	System.out.println("method of class D");
}

}

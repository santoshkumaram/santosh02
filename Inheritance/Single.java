package Inheritance;

public class Single {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		obj.print();
		obj.display();

	}

}
class parent{
	public void print() {
		System.out.println("parent class");
		
	}
}
class child extends parent{
	public void display() {
		System.out.println("child class");
}
}

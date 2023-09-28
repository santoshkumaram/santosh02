package Inheritance;

public class Multilevel {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube cube=new cube();
		cube.display();
		cube.area();
		cube.volume();
		}}
class shape {
	public void display() {
		System.out.println("inside display");
		
	}
}
class rectangle extends shape {
	public void area() {
		System.out.println("inside area");
		
	}
}
class cube extends rectangle {
	public void volume() {
		System.out.println("inside volume");
		
	}

}

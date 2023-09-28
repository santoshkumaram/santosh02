package Inheritance;

public class Overloading01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		apps obj=new apps();
		obj.login(12345);
		obj.login("santosh1@gamil.com");

	}

}
class apps{
	public void login(long  contact ) {
		System.out.println("logged with number");
		
	}
	public void login(String mail) {
		System.out.println("logged with mail");
	}
}

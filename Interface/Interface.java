package Interface;

interface Person{
	void show();
	}
class student implements Person{
	public void show() {
		System.out.println("student record");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person P= new student();
P.show();
	}

}

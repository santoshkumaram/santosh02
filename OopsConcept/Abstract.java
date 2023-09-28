package OopsConcept;


abstract class bike{
	abstract void run();
}
class Honda extends bike{
	void run() {
		System.out.println("safty drive");
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike obj=new Honda();
		obj.run();

	}

}

package Inheritance;

public class Overloading02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evining obj=new evining();
		obj.hai();
		}

}
class morning{
	public void hai() {
		System.out.println("Hai good morning");
	}
}
class evining extends morning{
	public void hai(){
		System.out.println("Hai good evining");
	}

}

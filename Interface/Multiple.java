package Interface;


interface bus{
	void start();
}
interface car{
	void run();

}
class vechicle implements bus,car{
	public void start() {System.out.println("toyota");
	}
	public void run() {System.out.println("TATA");
	
	}
}

public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vechicle obj=new vechicle();
		obj.start();
		obj.run();

}
}
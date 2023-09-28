package Interface;

interface drawing{
	void print();
}
 class triangle implements drawing{
	 public void print()
	 {
		 System.out.println(" TRIANGLE");
	 }
 }
	 class rectangle implements drawing{
		 public void print()
		 {
			 System.out.println(" RECTANGLE");
		 }
	 
	 }
 

public class Interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawing d =new rectangle();
		d.print();

	}
}

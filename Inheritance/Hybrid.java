package Inheritance;
class Animal{
	public void display()
	{
		System.out.println("pet animals");
	}
}

class cow extends Animal{
		public void display()
		{
			System.out.println("it makes amba sound");
		}
	}
		class cat extends Animal{
			public void display()
			{
				System.out.println("it makes sound meow");
			}
		}

public class Hybrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat obj=new cat();
		obj.display();
		cow obj1=new cow();
		obj1.display();
		

	}

}

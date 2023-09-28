package OopsConcept;

class Animal{
	public void Animalsound() {
		System.out.println("animal makes sound");
	}
}
class Lion extends Animal {
	public void Animalsound() 
	{
		System.out.println("Roaring");
	}
}
class Dog extends Animal {
	public void Animalsound() 
	{
		System.out.println("Barking");
	}
}
public class PolyOverriding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	Animal ANL=new Animal();
	Lion LN=new Lion();
	Dog DG=new Dog();
	ANL.Animalsound();
	LN.Animalsound();
	DG.Animalsound();
		
	}
	

}

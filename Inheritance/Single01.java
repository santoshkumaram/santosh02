package Inheritance;

public class Single01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childClass obj=new childClass();
		obj.setData(50);
		obj.showData();
}

}

class parentclass{
int a;
void setData(int a) {
this.a=a;
}
}
class childClass extends parentclass{
void showData() {
System.out.println("value of' a 'is  "+a );
}

}

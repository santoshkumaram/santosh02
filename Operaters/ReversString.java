package Operaters;

public class ReversString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String originalStr = "MY STATE KARNATAKA";
		    String reversedStr = "";
		    System.out.println("Original string: " + originalStr);
		        
		    for (int i = 0; i < originalStr.length(); i++) {
		      reversedStr = originalStr.charAt(i) + reversedStr;
		    }
		    
		    System.out.println("Reversed string: "+ reversedStr);
	}

}

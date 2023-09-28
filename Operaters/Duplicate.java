package Operaters;

public class Duplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]
				{21,22,23,23,24,25,26,26,27,28,28,29,29,30};
	
		System.out.println("Duplicate element in given array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}

}

}

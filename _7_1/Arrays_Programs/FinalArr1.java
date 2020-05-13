package _7_1.Arrays_Programs;

public class FinalArr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arr1[] = {1, 2, 3, 4, 5}; 
	       int arr2[] = {10, 20, 30, 40, 50}; 
	       arr2 = arr1;       
	       arr1 = arr2;   
	       for (int i = 0; i < arr2.length; i++) 
	          System.out.println(arr2[i]);
	}

}

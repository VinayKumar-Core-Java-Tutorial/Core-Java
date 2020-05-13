package _7_1.Arrays_Programs;

public class FinalArr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int arr[] = {1, 2, 3, 4, 5};  // Note: arr is final 
		for (int i = 0; i < arr.length; i++) 
		{ 
		arr[i] = arr[i]*10;   
		System.out.println(arr[i]);           

	}
	}
}

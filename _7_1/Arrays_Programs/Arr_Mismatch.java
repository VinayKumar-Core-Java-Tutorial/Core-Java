package _7_1.Arrays_Programs;
import java.util.Arrays;
public class Arr_Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		// Get the second Arrays 
		int intArr1[] = { 10, 15, 22 }; 
		 // To compare both arrays 
		System.out.println("The element mismatched at index: "+ Arrays.mismatch(intArr, intArr1)); 

	}

}

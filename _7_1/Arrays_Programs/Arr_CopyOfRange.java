package _7_1.Arrays_Programs;
import java.util.Arrays;
public class Arr_CopyOfRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 10, 20, 15, 22, 35 };
		// To print the elements in one line 
		System.out.println("Integer Array: " + Arrays.toString(intArr)); 
		System.out.println("\nNew Arrays by copyOfRange:\n"); 
		// To copy the array into an array of new length 
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArr, 1, 3))); 

	}

}

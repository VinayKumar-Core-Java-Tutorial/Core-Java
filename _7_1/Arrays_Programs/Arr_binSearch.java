package _7_1.Arrays_Programs;
import java.util.Arrays;
public class Arr_binSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		Arrays.sort(intArr); 
		int intKey = 22; 
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArr, intKey)); 

	}

}

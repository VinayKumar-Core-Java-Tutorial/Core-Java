package _7_4.Arrays_Programs;//8. Write a Java program to copy an array by iterating the array.
import java.util.Arrays;
public class Program_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		   int[] new_array = new int[10];     
		 
		   System.out.println("Source Array : "+Arrays.toString(my_array));     
		   
		   for(int i=0; i < my_array.length; i++) {
		    new_array[i] = my_array[i];
		}
		   System.out.println("New Array: "+Arrays.toString(new_array));
	}

}

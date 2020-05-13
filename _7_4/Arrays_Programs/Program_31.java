package _7_4.Arrays_Programs;//Write a Java program to check if an array of integers without 0 and -1
import java.util.*; 
import java.io.*; 
public class Program_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array_nums = {50, 77, 12, 54, -11};
		 int[] array_nums1 = {50, 77, 12, 54, 0,-1};	
		 System.out.println("Original Array1: "+Arrays.toString(array_nums)); 
			System.out.println("Result: "+test(array_nums));
			System.out.println("Original Array2: "+Arrays.toString(array_nums1));
			System.out.println("Result: "+test(array_nums1));
		    }	
		    public static boolean test(int[] numbers) {
		    for (int number : numbers) {
		      if (number == 0 || number == -1) {
		        return false;
		      }
		    }
		    return true;
		  }  
		}
	



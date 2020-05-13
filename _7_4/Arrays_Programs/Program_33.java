package _7_4.Arrays_Programs;//Write a Java program to check if an 
//array of integers contains two specified elements 65 and 77. 
import java.util.*; 
import java.io.*; 
public class Program_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {77, 77, 65, 65, 65, 77};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int num1 = 77;
	    int num2 = 65;
		
		System.out.println("Result: "+result(array_nums, num1, num2));
	    }	
	  
	  public static boolean result(int[] array_nums, int num1, int num2) {
	    for (int number : array_nums) {
	      boolean r = number != num1 && number != num2;
	      if (r) {
	        return false;
	        }
	     }
	        return true;
	   }
	}
	



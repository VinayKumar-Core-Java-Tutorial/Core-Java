package _7_4.Arrays_Programs;//Write a Java program to arrange the elements of a given array of 
//integers where all positive integers appear before all the negative integers
import java.util.Arrays;
public class Program_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arra_nums[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
	       System.out.println("Original array : "+Arrays.toString(arra_nums)); 
	       int j,temp,arr_size;

	        arr_size = 8;
	        for (int i = 0; i <arr_size; i++){
	            j = i;  
	            
	           //Shift positive numbers left, negative numbers right
	         
	            while ((j > 0) && (arra_nums[j] >0) && (arra_nums[j-1] < 0)){
	                  temp = arra_nums[j];
	                  arra_nums[j] = arra_nums[j-1];
	                  arra_nums[j-1] = temp;
	                  j--;
	            }
	        }
	       System.out.println("New array : "+Arrays.toString(arra_nums)); 
	}

}

package _7_4.Arrays_Programs;//Write a Java program to get the difference between the largest and smallest 
//values in an array of integers. The length of the array must be 1 and above.
import java.util.Arrays;
public class Program_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array_nums = {5, 7, 2, 4, 9};
			System.out.println("Original Array: "+Arrays.toString(array_nums)); 
			int max_val = array_nums[0];
			int min = array_nums[0];
			for(int i = 1; i < array_nums.length; i++)
			{
				if(array_nums[i] > max_val)
					max_val = array_nums[i];
				else if(array_nums[i] < min)
					min = array_nums[i];
			}
			System.out.println("Difference between the largest and smallest values of the said array: "+(max_val-min));
	}

}

package _7_4.Arrays_Programs;//Write a Java program to find a missing number in an array.
import java.util.*;
public class Program_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_num;
		   int[] numbers = new int[]{1,2,3,4,6,7};
		   total_num = 7;
		   int expected_num_sum = total_num * ((total_num + 1) / 2);
		   int num_sum = 0;
		   for (int i: numbers) {
		    num_sum += i;
		   }
		       System.out.print( expected_num_sum - num_sum);
			   System.out.print("\n");
	}

}

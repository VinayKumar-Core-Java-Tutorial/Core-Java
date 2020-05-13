package _7_1.Arrays_Programs;
import java.util.Arrays;
public class Deepcomparr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] inarr1 = {1,2,3};
         int[] inarr2 = {1,2,3};
         Object[] arr1 = {inarr1};// arr1 contains only one element 
         Object[] arr2 = {inarr2};// arr2 contains only one element 
         Object[] arr3 = {arr1};// arr3 contains only one element 
         Object[] arr4 = {arr2};// arr4 contains only one element 
         if(Arrays.deepEquals(arr3, arr4))
        	 System.out.println("same");
         else
        	 System.out.println("Not same");
	}

}

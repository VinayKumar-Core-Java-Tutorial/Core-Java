package _7_4.Arrays_Programs;//Write a Java program to print all the LEADERS in the array.   Go to the editor
//Note: An element is leader if it is greater than all the elements to its right side.

public class Program_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 9, 14, 23, 15, 0, 9};
	      int size = arr.length;
	        for (int i = 0; i < size; i++) 
	        {
	            int j;
	            for (j = i + 1; j < size; j++) 
	            {
	                if (arr[i] <= arr[j])
	                    break;
	            }
	            if (j == size) 
	                System.out.print(arr[i] + " ");
	        }
	}

}

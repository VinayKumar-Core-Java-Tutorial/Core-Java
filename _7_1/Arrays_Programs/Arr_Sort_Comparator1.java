package _7_1.Arrays_Programs;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  

public class Arr_Sort_Comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = { new Student(111, "bbbb", "london"), 
                new Student(131, "aaaa", "nyc"), 
                new Student(121, "cccc", "jaipur") }; 

System.out.println("Unsorted"); 
for (int i = 0; i < arr.length; i++) 
  System.out.println(arr[i]); 

Arrays.sort(arr, new Sortbyroll()); 

System.out.println("\nSorted by rollno"); 
for (int i = 0; i < arr.length; i++) 
  System.out.println(arr[i]); 
	}

}

package _7_4.Arrays_Programs;// Write a Java program to convert an ArrayList to an array.
import java.util.ArrayList;
import java.util.Arrays;
public class Program_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		  list.add("Python");
		 
		  list.add("Java");
		 
		  list.add("PHP");
		  
		  list.add("C#");
		 
		  list.add("C++");
		  
		  list.add("Perl");
		 
		  String[]  my_array = new String[list.size()];
		  
		  list.toArray(my_array);
		  
		  for (String  string : my_array)
		  {
		  System.out.println(string);
	}
	}
}

package _7_4.Arrays_Programs;//20. Write a Java program to convert an array to ArrayList.
import java.util.ArrayList;
import java.util.Arrays;
public class Program_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		  ArrayList<String>  list = new ArrayList<String>(Arrays.asList(my_array));
		  
		  System.out.println(list);
	}

}

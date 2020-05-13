package _7_4.Arrays_Programs;//sort a numeric array and a string array
import java.util.Arrays;
public class Program_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = { 10,15,2,7,4,3,23,89,90,15,14,18,17,100 };
     String[] str = { "apples", "mangoes", "bananas", "strawberries", "guavas" };
     System.out.println("Original numeric Array : " + Arrays.toString(arr));
     Arrays.sort(arr);
     System.out.println("Sorted numeric array : " + Arrays.toString(arr));
     System.out.println("Original String Arrays : " + Arrays.toString(str));
     Arrays.sort(str);
     System.out.println("Sorted String Array :" + Arrays.toString(str));
	}

}

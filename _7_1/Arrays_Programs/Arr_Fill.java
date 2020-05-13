package _7_1.Arrays_Programs;
import java.util.Arrays;
public class Arr_Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int intArr[] = { 10, 20, 15, 22, 35 }; 
		 int intKey = 22; 
		Arrays.fill(intArr, intKey); 
		// To fill the arrays 
		System.out.println("Integer Array on filling: " + Arrays.toString(intArr)); 

	}

}

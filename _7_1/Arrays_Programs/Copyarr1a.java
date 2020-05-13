package _7_1.Arrays_Programs;

public class Copyarr1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers = {1, 2, 3, 4, 5, 6};
	      int [] positiveNumbers = numbers;    // copying arrays
	      
	      numbers[0] = -1;

	      for (int number: positiveNumbers) {
	         System.out.print(number + ", ");
	}
	}
}

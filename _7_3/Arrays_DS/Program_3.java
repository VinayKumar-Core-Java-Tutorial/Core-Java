package _7_3.Arrays_DS;//Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i
import java.util.*;
import java.lang.*;

public class Program_3 {
	// function to rearrange the array
	public static void rearrangeArr(int arr[],
	int n)
	{
	// total even positions
	int evenPos = n / 2;

	// total odd positions
	int oddPos = n - evenPos;

	int[] tempArr = new int [n];

	// copy original array in an
	// auxiliary array
	for (int i = 0; i < n; i++)
	tempArr[i] = arr[i];

	// sort the auxiliary array
	Arrays.sort(tempArr);

	int j = oddPos - 1;

	// fill up odd position in
	// original array
	for (int i = 0; i < n; i += 2) {
	arr[i] = tempArr[j];
	j--;
	}

	j = oddPos;

	// fill up even positions in
	// original array
	for (int i = 1; i < n; i += 2) {
	arr[i] = tempArr[j];
	j++;
	}

	// display array
	for (int i = 0; i < n; i++)
	System.out.print(arr[i] + " ");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int []{ 1, 2, 3, 4, 5,
				6, 7 };
				int size = 7;
				rearrangeArr(arr, size);


	}

}

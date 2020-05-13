package _7_3.Arrays_DS;//Write a program to reverse an array or string

public class Program_2 {
	/* Function to reverse arr[] from
	start to end*/
	static void rvereseArray(int arr[],
	int start, int end)
	{
	int temp;

	while (start < end)
	{
	temp = arr[start];
	arr[start] = arr[end];
	arr[end] = temp;
	start++;
	end--;
	}
	}

	/* Utility that prints out an
	array on a line */
	static void printArray(int arr[],
	int size)
	{
	for (int i = 0; i < size; i++)
	System.out.print(arr[i] + " ");

	System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6};
		printArray(arr, 6);
		rvereseArray(arr, 0, 5);
		System.out.print("Reversed array is \n");
		printArray(arr, 6);


	}

}

package _7_4.Arrays_Programs;// Write a Java program to check whether 
//there is a pair with a specified sum of a given sorted and rotated array. 

public class Program_48 {
	static boolean sum_pair(int arr_int[], 
            int n, int x)
{
int k;
for (k = 0; k < n - 1; k++)
if (arr_int[k] > arr_int[k+1])
break;

int l = (k + 1) % n;                           

int r = k;                          

while (l != r)
{
if (arr_int[l] + arr_int[r] == x)
return true;
if (arr_int[l] + arr_int[r] < x)
l = (l + 1) % n;

else
r = (n + r - 1) % n;
}
return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_int[] = {22, 25, 17, 18, 19, 20};
        int sum = 42;
        int n = arr_int.length;
      
        if (sum_pair(arr_int, n, sum))
            System.out.print("Array has a pair of elements with sum 42.");
        else
            System.out.print("Array has no pair with sum 42.");
	}

}

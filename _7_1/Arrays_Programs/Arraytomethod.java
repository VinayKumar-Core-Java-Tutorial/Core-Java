package _7_1.Arrays_Programs;

public class Arraytomethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {3,1,2,5,4};
        sum(arr);
	}
	public static void sum(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) 
			sum+=arr[i];
			System.out.println("sum of array values is =" + sum);
		}
	}
    


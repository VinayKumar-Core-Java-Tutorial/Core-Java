package _7_1.Arrays_Programs;

public class Comparr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3}; 
        int arr2[] = {1, 2, 3}; 
        if (arr1 == arr2) // Same as arr1.equals(arr2) 
            System.out.println("Same"); 
        else
            System.out.println("Not same"); 

	}

}

//In Java, arrays are first class objects. In the above program, arr1 and arr2 are two references 
//to two different objects. So when we compare arr1 and arr2,
//two reference variables are compared, therefore we get the output as “Not Same”*/
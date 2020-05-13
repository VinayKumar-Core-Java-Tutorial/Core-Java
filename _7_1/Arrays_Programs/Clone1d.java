package _7_1.Arrays_Programs;

public class Clone1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {1,2,3}; 
        
        int cloneArray[] = intArray.clone(); 
          
        // will print false as deep copy is created 
        // for one-dimensional array 
        System.out.println(intArray == cloneArray); 
          
        for (int i = 0; i < cloneArray.length; i++) { 
            System.out.print(cloneArray[i]+" "); 

	}
	}
}

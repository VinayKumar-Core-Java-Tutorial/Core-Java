package _7_1.Arrays_Programs;

public class Clonemulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][] = {{1,2,3},{4,5}}; 
        
        int cloneArray[][] = intArray.clone(); 
          
        // will print false 
        System.out.println(intArray == cloneArray); 
          
        // will print true as shallow copy is created 
        // i.e. sub-arrays are shared 
        System.out.println(intArray[0] == cloneArray[0]); 
        System.out.println(intArray[1] == cloneArray[1]); 

	}

}

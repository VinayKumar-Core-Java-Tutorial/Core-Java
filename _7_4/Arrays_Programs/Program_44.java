package _7_4.Arrays_Programs;//Write a Java program to find all combination of four elements 
//of a given array whose sum is equal to a given value. 

public class Program_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10, 20, 30, 40, 1, 2};
	      int n = nums.length;
	      // given value
	      int s = 53;
	       System.out.println("Given value: "+s);
	        System.out.print("Combination of four elements:");  
	        // Find other three elements after fixing first element
	        for (int i = 0; i < n - 3; i++) 
	        {
	          // Find other two elements after fixing second element
	            for (int j = i + 1; j < n - 2; j++) 
	            {
	           // Find the fourth element after fixing third element    
	              for (int k = j + 1; k < n - 1; k++) 
	                {
	            // find the fourth
	                    for (int l = k + 1; l < n; l++) 
	                    {
	                        if (nums[i] + nums[j] + nums[k] + nums[l] == s) 
	                            System.out.print("\n"+nums[i]+" "+nums[j]+" "+nums[k] 
	                                                                 +" "+nums[l]);
	                    }
	                }
	            }
	    }
	}

}
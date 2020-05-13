package _7_3.Arrays_DS;

public class Program_4 {
	int equilibrium(int arr[], int n) 
    { 
        int i, j; 
        int leftsum, rightsum; 
  
        /* Check for indexes one by one until  
           an equilibrium index is found */
        for (i = 0; i < n; ++i) { 
  
            /* get left sum */
            leftsum = 0;   
            for (j = 0; j < i; j++) 
                leftsum += arr[j]; 
  
            /* get right sum */
            rightsum = 0; 
            for (j = i + 1; j < n; j++) 
                rightsum += arr[j]; 
  
            /* if leftsum and rightsum are same,  
               then we are done */
            if (leftsum == rightsum) 
                return i; 
        } 
  
        /* return -1 if no equilibrium index is found */
        return -1; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_4 equi = new Program_4(); 
        int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
        int arr_size = arr.length; 
        System.out.println(equi.equilibrium(arr, arr_size)); 

	}

}

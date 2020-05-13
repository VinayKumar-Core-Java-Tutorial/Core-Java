package _7_1.Arrays_Programs;

public class Multidifor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {
		            {1, -2, 3}, 
		            {-4, -5, 6, 9}, 
		            {7}, 
		      };
		      
		     for (int i = 0; i < a.length; i++) {
		        for(int j = 0; j < a[i].length; j++) {
		           System.out.println(a[i][j]);
		        }
		     }
	}

}

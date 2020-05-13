package do_while_programs;//Inverted half hollow pyramid of numbers

public class Program_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		  for(i = 1; i <= n; i++)
		  {
			  j=i;
		       do{
		      
		          if  (i == 1 || j == n || j == i) {
		        	  System.out.print(j+" ");
		         }
		              
		          else {
		             System.out.print("  ");
		      }
		     j++;
		  }while( j <= n);
		      System.out.println();
		  
			}
	}

}

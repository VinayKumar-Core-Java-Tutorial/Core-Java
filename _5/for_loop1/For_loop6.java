package for_loop1;//Inverted hollow half pyramid of numbers

public class For_loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i,j,n=5;
  for(i = 1; i <= n; i++)
  {
      for(j = i; j <= n; j++)
      {
          if  (i == 1 || j == n || j == i) {
        	  System.out.print(j+" ");
         }
              
          else {
             System.out.print("  ");
      }
     
  }
      System.out.println();
  
	}
	}
}

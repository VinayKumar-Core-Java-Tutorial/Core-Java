package do_while_programs;// Solid half diamond of numbers and stars

public class Program_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=3, i, j;
		System.out.println("* ");
		for(i=1; i<=N; i++)
	        {
	          j=1;  
			
	          do  {
	                if(j == 1)
	                    System.out.print("* ");
	                System.out.print(j+" ");
	                j++;
	            }while( j<=i);
	            for(j=i-1; j>=1; j--)
	            {		
	                System.out.print(j+" ");
	            }
	            System.out.print("* ");
	            System.out.println();
	        }

	        for(i=N-1; i>=1; i--)
	        {	
	           j=1;
	        
	            do{
	                if(j == 1)
	                    System.out.print("* ");
	                System.out.print(j+" ");
	                j++;
	            }while( j<=i);
	            for(j=i-1; j>=1; j--)
	            {
	                System.out.print(j+" ");
	            }
	            System.out.print("* ");
	            System.out.println();
	        }
	        System.out.println("* ");
	}

}

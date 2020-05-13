package for_loop1;//solid half diamond 

public class For_loop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=3, i, j;
		System.out.println("* ");
		for(i=1; i<=N; i++)
	        {
	            for(j=1; j<=i; j++)
	            {
	                if(j == 1)
	                    System.out.print("* ");
	                System.out.print(j+" ");
	            }
	            for(j=i-1; j>=1; j--)
	            {		
	                System.out.print(j+" ");
	            }
	            System.out.print("* ");
	            System.out.println();
	        }

	        for(i=N-1; i>=1; i--)
	        {	
	            for(j=1; j<=i; j++)
	            {
	                if(j == 1)
	                    System.out.print("* ");
	                System.out.print(j+" ");
	            }
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

package for_loop1;//Half diamond of numbers and stars

public class For_loop10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k,N=4,count=0;

	          for(i=1;i<=N;i++) {

	            k=1;

	            for(j=0;j<i;j++)

	            {

	                System.out.print(i);

	                if(k<i)

	                {

	                    System.out.print("*");

	                    k=k+1;

	                }

	            }

	            System.out.println();

	        }

	        for(i=N;i>0;i--)

	        {

	            k=1;

	            for(j=0;j<i;j++)

	            {

	                System.out.print(i);

	                if(k<i)

	                {

	                    System.out.print("*");

	                    k=k+1;

	                }

	            }

	            System.out.println();

	        }

	}

}

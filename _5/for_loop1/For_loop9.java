package for_loop1;//Half diamond of numbers

public class For_loop9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,s=3,N=4,count=0;


	        for(i=s;count<4;count++)

	        {

	            for(j=0;j<count+1;j++) {

	                System.out.print(i);
	            }  
	            i=i+1;
	            System.out.println();
            }

	        for(i=s+N-2;count>0;count--)

	        {

	            for(j=0;j<count-1;j++) {

	                System.out.print(i);
	            }
	            i=i-1;
	            System.out.println();

	           

	        }

	}

}

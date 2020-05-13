package do_while_programs;//Half diamond of numbers and stars

public class Program_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=1,n=4; 

        for(i=1;i<=n;i++)

        {
             j=1;
            do

            {
            	

                if(j<i)

                    System.out.print(count++ + "*");

                else

                    System.out.print(count++);
                j++;
            }while(j<=i);
             
            System.out.println();

        }

        count=count-n;

        for(i=n;i>=1;i--)

        { 
        	j=1;
        	
        do
        {
             
            if(j<i)

                System.out.print(count++ + "*");

            else

                System.out.print(count++);
            j++;     
        }while(j<=i);
            
         count=(count+1)-2*i;
       
         System.out.println();

        }

	}

}

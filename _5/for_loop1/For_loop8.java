package for_loop1;//Half diamond of numbers and stars

public class For_loop8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=1,n=4; 

        for(i=1;i<=n;i++)

        {
              for(j=1;j<=i;j++)

            {

                if(j<i)

                    System.out.print(count++ + "*");

                else

                    System.out.print(count++);

            }
               
               System.out.println();

        }

        count=count-n;

        for(i=n;i>=1;i--)

        { for(j=1;j<=i;j++)

        {

            if(j<i)

                System.out.print(count++ + "*");

            else

                System.out.print(count++);

        }

         count=(count+1)-2*i;

         System.out.println();

        }

    }


  }
	



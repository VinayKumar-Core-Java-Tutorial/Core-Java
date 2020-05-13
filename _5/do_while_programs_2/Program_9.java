package do_while_programs;//Half diamond of numbers

public class Program_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,s=3,N=4,count=0;


        for(i=s;count<4;count++)

        {
              j=0;
            do{

                System.out.print(i);
                j++;
            }   while(j<count+1);
            i=i+1;
            System.out.println();
        }

        for(i=s+N-2;count>0;count--)

        {
               j=0;
               while(j<count-1) {

                System.out.print(i);
                j++;
            }
            i=i-1;
            System.out.println();

           

        }

	}

}

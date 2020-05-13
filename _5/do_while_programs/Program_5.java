package do_while_programs;//Half hollow pyramid of numbers

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		  
		  for(i=1;i<=5;i++) {
			  j=0;
			   do{
				  j++;
				  if(i==3&&j==2) {
					  System.out.print("  ");
					  continue;
				  }
				  if(i==4&&j==2||i==4&&j==3) {
					  System.out.print("  ");
					  continue;
				  }
				  System.out.print(j+" ");
			  }while(j<i);
			  System.out.println();
		  }
	}

}

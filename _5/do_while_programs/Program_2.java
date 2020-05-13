package do_while_programs;// Hollow half pyramid of numbers

public class Program_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		  for(i=1;i<=5;i++) {
			  for (k=1;k<=(5-i);k++) {
				  System.out.print(" ");
			  }
			  j=0;
            do {
            	          
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

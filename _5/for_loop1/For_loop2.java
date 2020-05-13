package for_loop1;//Hollow full pyramid of numbers

public class For_loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i,j,k;
  for(i=1;i<=5;i++) {
	  for (k=1;k<=(5-i);k++) {
		  System.out.print(" ");
	  }
	  for(j=1;j<=i;j++) {
		  if(i==3&&j==2) {
			  System.out.print("  ");
			  continue;
			  
		  }
		  if(i==4&&j==2||i==4&&j==3) {
			  System.out.print("  ");
			  continue;
		  }
		  System.out.print(j+" ");
	  }
	  System.out.println();
  }
	  
	}

}

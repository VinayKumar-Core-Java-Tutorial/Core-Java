package for_loop1;//full pyramid of numbers

public class For_loop4 {// Full pyramid of numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,l=0,m=0,k=0;
	      for(i=1;i<=5;i++) {
				 for(j=0;j<(5-i);j++) {
					 System.out.print("  ");
					 ++l;
				 }
		for(k=0;k<2*i-1;k++) {		 
					 if(l<=(5-1)) {
						 System.out.print(i+k+" ");
						 ++l;
					 }
					 else {
						 ++m;
						 System.out.print((i+k-2*m)+" ");
					 }
					 
				 }
		
				 m=l=k=0;
				 System.out.println();
	      
	      
	    	}
  }
	}
	  
	
  
	



package do_while_programs;// Full diamond of stars

public class Program_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5,k,l,m,k1;
	    for(i=1;i<=n;i++) {
	    	for(k=5;k>=i;k--) {
	    		System.out.print(" ");
	    	}
	    	j=1;
	    	 do{
	    		
	    		System.out.print("* ");
	    		j++;
	    	}while(j<=i);
	    System.out.println();
	    }
	    for( l=n;l>=1;l--) {
	    	for(k1=5;k1>=l;k1--) {
	    		System.out.print(" ");
	    	}
	    	m=1;
	    	do {
	    		System.out.print("* ");
	    		m++;
	    	}while(m<=l);
	    	System.out.println();
	    }
	}

}

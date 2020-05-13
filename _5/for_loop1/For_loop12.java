package for_loop1;//Full Diamond of stars

public class For_loop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,n=5,k,l,m,k1;
    for(i=1;i<=n;i++) {
    	for(k=5;k>=i;k--) {
    		System.out.print(" ");
    	}
    	for(j=1;j<=i;j++) {
    		
    		System.out.print("* ");
    	}
    System.out.println();
    }
    for( l=n;l>=1;l--) {
    	for(k1=5;k1>=l;k1--) {
    		System.out.print(" ");
    	}
    	for(m=1;m<=l;m++) {
    		System.out.print("* ");
    	}
    	System.out.println();
    }
    
	}

}

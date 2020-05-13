package do_while_programs;// Full pyramid of numbers

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0,l=0,m=0;
		  
		  for(i=1;i<=5;i++) {
			 for(j=0;j<(5-i);j++) {
				 System.out.print("  ");
				 ++l;
			 }
			do {
				 if(l<=(5-1)) {
					 System.out.print(i+k+" ");
					 ++l;
				 }
				 else {
					 ++m;
					 System.out.print((i+k-2*m)+" ");
				 }
				 ++k;
			 } while(k!=2*i-1);
			 m=l=k=0;
			 System.out.println();
		  }
	}

}

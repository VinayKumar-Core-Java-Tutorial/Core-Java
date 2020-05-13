package do_while_programs;//Hollow diamond inscribed in a rectangle of stars

public class Program_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n=5;
		for(i=1;i<=n;i++) {
			for(j=(n+1)-i;j>=1;j--) {
				System.out.print("*");
			}
			k=1;
			do {
				
					System.out.print(" ");
					k++;
				}while(k<=2*i-1);
			for(j=(n+1)-i;j>=1;j--) {
				System.out.print("*");
			}	
			System.out.println();
		}
		for( i=n;i>=1;i--) {
			for(j=1;j<=((n+1)-i);j++) {
				System.out.print("*");
			}
			k=1;
			do {
				
				System.out.print(" ");
				k++;
			}while(k<=2*i-1);
			for(j=1;j<=((n+1)-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

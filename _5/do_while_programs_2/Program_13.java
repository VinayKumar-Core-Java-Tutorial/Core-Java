package do_while_programs;// Half diamond of stars

public class Program_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5,k,l;
		i=1;
		do {
			for(j=1;j<=i;j++) {
				System.out.print("*");
				}
			System.out.println();
			i++;
			}while(i<=n);
		for(k=(n-1);k>=1;k--) {
			for(l=1;l<=k;l++) {
			System.out.print("*");
		}
		System.out.println();
			}
	}

}

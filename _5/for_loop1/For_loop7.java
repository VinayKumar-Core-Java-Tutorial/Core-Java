package for_loop1;  //Hollow diamond inscribed in a rectangle

public class For_loop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k,n=5;
for(i=1;i<=n;i++) {
	for(j=(n+1)-i;j>=1;j--) {
		System.out.print("*");
	}
	k=1;
	for(k=1;k<=2*i-1;k++) {
		
			System.out.print(" ");
		}
	for(j=(n+1)-i;j>=1;j--) {
		System.out.print("*");
	}	
	System.out.println();
}
for( i=n;i>=1;i--) {
	for(j=1;j<=((n+1)-i);j++) {
		System.out.print("*");
	}
	for(k=1;k<=2*i-1;k++) {
		
		System.out.print(" ");
	}
	for(j=1;j<=((n+1)-i);j++) {
		System.out.print("*");
	}
	System.out.println();
}

	
}
	}



package for_loop1;// Half diamond of stars

public class For_loop13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,n=5,k,l;
for(i=1;i<=n;i++) {
	for(j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
for(k=(n-1);k>=1;k--) {
	for(l=1;l<=k;l++) {
	System.out.print("*");
}
System.out.println();
	}
	}

}

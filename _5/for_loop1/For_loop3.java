package for_loop1;//Inverted half pyramid of numbers

public class For_loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
for(i=1;i<=5;i++) {
	for(j=1;j<=(5+1)-i;j++) {
		System.out.print(j+" ");
	}
	
	System.out.println();
}
	}

}

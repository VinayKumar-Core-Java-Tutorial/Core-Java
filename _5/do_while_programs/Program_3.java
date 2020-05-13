package do_while_programs;//Inverted half pyramid of numbers

public class Program_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=5;i++) {
			j=1;
			 do{
				System.out.print(j+" ");
				j++;
			}while(j<=(5+1)-i);
			
			System.out.println();
		}
	}

}

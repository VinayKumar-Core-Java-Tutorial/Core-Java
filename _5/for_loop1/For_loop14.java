package for_loop1;//Hollow Full diamond of stars
import java.util.*;
public class For_loop14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, space, k = 0, n;
        System.out.println("\nEnter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println();

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= n-1; j++)
            {
                System.out.print(" ");
            }	
            while (k != (2*i-1))
            {
                if ((k == 0) || (k == 2 * i - 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
                k++;
            }
            k = 0;
            System.out.print("\n");
        }
        n--;
        for (i = n; i >= 1; i--)	
        {
            for (j = 0; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            k = 0;	
            while (k != (2 * i - 1))
            {
                if ((k == 0) || (k == 2 * i - 2))
                    System.out.print(" ");
                else
                    System.out.print(" ");
                k++;
            }
            System.out.print("\n");
        }	
	    }
	}



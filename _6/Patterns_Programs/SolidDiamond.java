package _6.Patterns_Programs;

import java.util.Scanner;

public class SolidDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, c, k, space = 1;
        System.out.print("\nEnter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println();
        space = n - 1;

        for (k = 1; k <= n; k++)
        {
            for (c = 1; c <= space; c++)
                System.out.print(" ");
            space--;
            for (c = 1; c <= 2*k-1; c++)
                System.out.print("*");
            System.out.print("\n");
        }
        space = 1;

        for (k = 1; k <= n - 1; k++)
        {
            for (c = 1; c <= space; c++)
                System.out.print(" ");
            space++;
            for (c = 1 ; c <= 2*(n-k)-1; c++)
                System.out.print("*");
            System.out.print("\n");
        }


	}

}

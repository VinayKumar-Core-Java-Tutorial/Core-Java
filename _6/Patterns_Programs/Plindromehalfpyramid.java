package _6.Patterns_Programs;

import java.util.Scanner;

public class Plindromehalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, k, l, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of rows : ");
        n = sc.nextInt();
        System.out.print("\n");
        for(i = 1; i <= n; i++)
        {
            for(k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
            for(l = i-1; l >= 1; l--)
            {
                System.out.print(l + " ");
            }
            System.out.print("\n");
        }

	}

}

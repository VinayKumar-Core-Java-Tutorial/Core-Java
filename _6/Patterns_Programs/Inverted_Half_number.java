package _6.Patterns_Programs;

import java.util.Scanner;

public class Inverted_Half_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i,j;
        for(i = 1; i<= n; i++)
        {
            for(j = i; j <= n; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}

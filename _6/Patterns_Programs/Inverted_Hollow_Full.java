package _6.Patterns_Programs;

import java.util.Scanner;

public class Inverted_Hollow_Full {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (n * 2 - (2 * i - 1)); j++) {

                if (i == 1 || j == 1 || j == (n * 2 - (2 * i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

	}

}

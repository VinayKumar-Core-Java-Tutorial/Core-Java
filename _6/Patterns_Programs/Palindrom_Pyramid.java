package _6.Patterns_Programs;

import java.util.Scanner;

public class Palindrom_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j, k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(" ");
		for (i = 1; i <= n; i++) {

			for (j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (j = 1, k = 2 * i - 1; j <= 2 * i - 1; j++, k--) {
				if (j <= k)
					System.out.print(j);
				else
					System.out.print(k);
			}
			System.out.print("\n");
			System.out.print(" ");

		}

	}

}

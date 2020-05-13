package _6.Patterns_Programs;

import java.util.Scanner;

public class Hollow_Half_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, j;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

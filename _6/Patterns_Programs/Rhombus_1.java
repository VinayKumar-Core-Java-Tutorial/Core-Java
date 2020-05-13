package _6.Patterns_Programs;

import java.util.Scanner;

public class Rhombus_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt();
// solid rhombus
        System.out.println("Solid Rhombus");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");  // leading spaces
            }
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// hollow rhombus
        System.out.println("Hollow Rhombus");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");  // leading spaces
                for (j = 0; j < n; j++) {
// upper horizontal, bottom horizontal, left diagonal, right diagonal
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

	}

}

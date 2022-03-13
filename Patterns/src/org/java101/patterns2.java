package org.java101;

public class patterns2 {
    public static void main(String[] args) {
        pattern13(5);
    }
    
    public static void pattern13 (int n) {
        for (int i = 1; i <= n ; i++) {
            int firstSpaces = i != n ? n - i : 0;
            for (int j = 0; j < firstSpaces; j++) {
                System.out.print(" ");
            }
            int firstStars = i != n ? 1 : 0;
            for (int j = 0; j < firstStars; j++) {
                System.out.print("*");
            }
            int secondSpaces = i > 1 && i != n ? 2 * i - 3 : 0;
            for (int j = 0; j < secondSpaces; j++) {
                System.out.print(" ");
            }
            int secondStars = i < n && i > 1 ? 1 : 0;
            for (int j = 0; j < secondStars; j++) {
                System.out.print("*");
            }
            int lastStars = i == n ? 2 * n - 1 : 0;
            for (int j = 0; j < lastStars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

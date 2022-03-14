package org.java101;

public class patterns2 {
    public static void main(String[] args) {
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
        pattern16(5);
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

    public static void pattern14 (int n) {
        for (int i = 1; i <= n ; i++) {
            int firstSpaces = i > 1 ? i - 1 : 0;
            for (int j = 0; j < firstSpaces; j++) {
                System.out.print(" ");
            }
            int firstStars = i > 1 ? 1 : 0;
            for (int j = 0; j < firstStars; j++) {
                System.out.print("*");
            }
            int secondSpaces = i > 1 && i != n ? 2 * (n - i) - 1 : 0;
            for (int j = 0; j < secondSpaces; j++) {
                System.out.print(" ");
            }
            int secondStars = i < n && i > 1 ? 1 : 0;
            for (int j = 0; j < secondStars; j++) {
                System.out.print("*");
            }
            int lastStars = i == 1 ? 2 * n - 1 : 0;
            for (int j = 0; j < lastStars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern15 (int n) {
        int secondSpaces = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int firstSpaces = i <= n ? n - i : i - n;
            for (int j = 0; j < firstSpaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i <= 5) {
                secondSpaces = 2 * i - 3 ;
            } else {
                secondSpaces = secondSpaces - 2;
            }
            if(secondSpaces < 0) {
                secondSpaces = 0;
            }
            for (int j = 0; j < secondSpaces; j++) {
                System.out.print(" ");
            }
            int secondStars = i != 2 * n - 1 && i != 1 ? 1 : 0;
            for (int j = 1; j <= secondStars ; j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }

    public static void pattern16 (int n) {

        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                int num = factorial(i)/(factorial(j) * factorial(i - j));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int factorial (int n) {
        int product = 1;
        if(n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = n; i > 1 ; i--) {
                product = product * i;
            }
        }
        return product;
    }
}

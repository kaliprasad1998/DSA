package org.java101;

public class patterns2 {
    public static void main(String[] args) {
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
//        pattern16(5);
//        pattern17(4);
//        pattern18(5);
//        pattern19(5);
//        pattern20(5);
//        pattern21(5);
//        pattern22(5);
        pattern23(3);
    }

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
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

    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
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

    public static void pattern15(int n) {
        int secondSpaces = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int firstSpaces = i <= n ? n - i : i - n;
            for (int j = 0; j < firstSpaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i <= 5) {
                secondSpaces = 2 * i - 3;
            } else {
                secondSpaces = secondSpaces - 2;
            }
            if (secondSpaces < 0) {
                secondSpaces = 0;
            }
            for (int j = 0; j < secondSpaces; j++) {
                System.out.print(" ");
            }
            int secondStars = i != 2 * n - 1 && i != 1 ? 1 : 0;
            for (int j = 1; j <= secondStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {

        for (int i = 0; i < n; i++) {
            int spaces = n - i - 1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                int num = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int factorial(int n) {
        int product = 1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = n; i > 1; i--) {
                product = product * i;
            }
        }
        return product;
    }

    public static void pattern17(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int noOfSpaces = i <= 4 ? n - i : i - n;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfFirstNums = i <= 4 ? i : 2 * n - i;
            for (int j = noOfFirstNums; j >= 1; j--) {
                System.out.print(j);
            }
            int secondNums = i <= 4 ? i + 1 : 2 * n - i + 1;
            for (int j = 2; j < secondNums; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {

        for (int i = 1; i <= 2 * n; i++) {
            int stars = i <= 5 ? n - i + 1 : i - n;
            int spaces = i <= 5 ? 2 * (i - 1) : 2 * (2 * n - i);
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i <= 5 ? i : 2 * n - i;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            int spaces = 2 * Math.abs(n - i);
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            int spaces = i != 1 && i != n ? 2 : 0;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            int lastStars = i != 1 && i != n ? 1 : n - 2;
            for (int j = 0; j < lastStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern21 (int n) {
        int start = 1;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    public static void pattern22 (int n) {
        for (int i = 1 ; i <= n ; i++) {
            int value = i % 2;
            for (int j = 0; j < i; j++) {
                System.out.print(value + " ");
                value = reverseValue(value);
            }
            System.out.println();
        }
    }

    private static int reverseValue(int i) {
        if(i == 0) {
            return 1;
        }
        return 0;
    }

    // TODO: Correct this pattern
    public static void pattern23 (int n) {
        for (int i = 1; i <= n ; i++) {
            int firstThirdSpaces = 2 * (n - i) - 1;
            if (firstThirdSpaces < 0) {
                firstThirdSpaces = 0;
            }
            for (int j = 0; j < firstThirdSpaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int secondFourthSpaces = 2 * i - 3;
            if (secondFourthSpaces < 0) {
                secondFourthSpaces = 0;
            }
            for (int j = 0; j < secondFourthSpaces; j++) {
                System.out.print(" ");
            }
            int secondFourthStars = i != 1 && i != n ? 1 : 0;
            for (int j = 0; j < secondFourthStars; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < firstThirdSpaces; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < secondFourthSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < secondFourthStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

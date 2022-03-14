package org.java101;

public class patterns3 {
    public static void main(String[] args) {
//        pattern25(6);
//        pattern26(7);
//        pattern27(4);
//        pattern28(5);
//        pattern29(4);
//        pattern30(6);
//        char c = 65;
//        System.out.println(c);
//        pattern32(7);
        pattern33(5);
    }

    public static void pattern25(int n) {
        for (int i = 1; i <= n; i++) {
            int noOfFirstSpaces = n - i;
            for (int j = 0; j < noOfFirstSpaces; j++) {
                System.out.print(" ");
            }
            int noOfFirstStars = i != 1 && i != n ? 1 : n;
            for (int j = 0; j < noOfFirstStars; j++) {
                System.out.print("*");
            }
            int noOfSecondSpaces = i != 1 && i != n ? n - 2 : 0;
            for (int j = 0; j < noOfSecondSpaces; j++) {
                System.out.print(" ");
            }
            int noOfSecondStars = i != 1 && i != n ? 1 : 0;
            for (int j = 0; j < noOfSecondStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern26(int n) {
        int count = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(i + " ");
            }
            count--;
            System.out.println();
        }
    }

    public static void pattern27(int n) {
        int start = 1;
        int max = n * (n + 1);
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = 2 * i - 1;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfNums = n - i + 1;
            for (int j = 0; j < noOfNums; j++) {
                System.out.print(start + " ");
                start++;
            }
            int spaces2 = i != n ? 1 : 0;
//            int spaces2 = i != n ? 2 : 0; // experiment for higher values of n
            for (int j = 0; j < spaces2; j++) {
                System.out.print(" ");
            }
//            System.out.print(" ");

            int num = max - noOfNums + 1;
            for (int j = noOfNums; j >= 1; j--) {
                System.out.print(num + " ");
                num++;
            }
            max = max - noOfNums;
            System.out.println();
        }
    }

    public static void pattern28(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int noOfSpaces = Math.abs(n - i);
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int noOfStars = i <= n ? i : 2 * n - i;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern29(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int noOfStars = i <= n ? i : 2 * n - i;
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("*");
            }
            int noOfSpaces = 2 * Math.abs(n - i);
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern30(int n) {
        for (int i = 1; i <= n; i++) {
            int noOfSpaces = 2 * (n - i);
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            int num = i;
            for (int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num--;
            }
            int noOfNums = i - 1;
            int startNum = 2;
            for (int j = 0; j < noOfNums; j++) {
                System.out.print(startNum + " ");
                startNum++;
            }
            System.out.println();
        }
    }

    // TODO: Learn and complete it
    public static void pattern31(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {

        }
    }

    public static void pattern32(int n) {
        int start = 65 + n;
        for (int i = 1; i <= n; i++) {
            char c = (char) (start - i);
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }

    public static void pattern33 (int n) {
        int start = 97;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i; j++) {
                if (start % 2 == 0) {
                    System.out.print((char) (start - 32 ) + " ");
                } else {
                    System.out.print((char) start + " ");
                }
                start++;
            }
            System.out.println();
        }
    }
}

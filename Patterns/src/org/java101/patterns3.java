package org.java101;

public class patterns3 {
    public static void main(String[] args) {
//        pattern25(6);
        pattern26(7);
    }
    
    public static void pattern25(int n) {
        for (int i = 1; i <= n ; i++) {
            int noOfFirstSpaces = n - i;
            for (int j = 0; j < noOfFirstSpaces; j++) {
                System.out.print(" ");
            }
            int noOfFirstStars = i != 1 && i !=n ? 1 : n;
            for (int j = 0; j < noOfFirstStars; j++) {
                System.out.print("*");
            }
            int noOfSecondSpaces =  i != 1 && i !=n ? n - 2 : 0;
            for (int j = 0; j < noOfSecondSpaces; j++) {
                System.out.print(" ");
            }
            int noOfSecondStars = i != 1 && i !=n ? 1 : 0;
            for (int j = 0; j < noOfSecondStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern26 (int n) {
        int count = n;
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(i + " ");
            }
            count--;
            System.out.println();
        }
    }
}

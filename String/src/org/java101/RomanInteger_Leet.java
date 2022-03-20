package org.java101;

// https://leetcode.com/problems/roman-to-integer/
class RomanInteger_Leet {
    public static void main(String[] args) {
        int out = romanToInt("MCMXCIV");
        System.out.println(out);
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
                    sum += 4;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
                    sum += 9;
                    i++;
                } else {
                    sum += 1;
                }
                continue;
            }
            if (s.charAt(i) == 'V') {
                sum += 5;
                continue;
            }
            if (s.charAt(i) == 'X') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
                    sum += 40;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    sum += 90;
                    i++;
                } else {
                    sum += 10;
                }
                continue;
            }
            if (s.charAt(i) == 'L') {
                sum += 50;
                continue;
            }
            if (s.charAt(i) == 'C') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
                    sum += 400;
                    i++;
                } else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
                    sum += 900;
                    i++;
                } else {
                    sum += 100;
                }
                continue;
            }
            if (s.charAt(i) == 'D') {
                sum += 500;
                continue;
            }
            if (s.charAt(i) == 'M') {
                sum += 1000;
                continue;
            }

        }
        return sum;
    }
}
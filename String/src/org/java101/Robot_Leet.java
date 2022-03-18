package org.java101;

class Robot_Leet {
    public boolean judgeCircle(String moves) {
        int cr = 0;
        int cd = 0;

        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                cr++;
            } else if (moves.charAt(i) == 'L') {
                cr--;
            } else if (moves.charAt(i) == 'U') {
                cd--;
            } else if (moves.charAt(i) == 'D') {
                cd++;
            }
        }
        return (cr == 0 && cd == 0);
    }
}
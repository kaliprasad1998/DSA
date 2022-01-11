public class EvenDigitsLeet {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        int[] nums = {12, 3455, 2, 6, 7896};
        int out = findNumbers(nums);
        System.out.println(out);
        System.out.println(digits2(-567888));
        System.out.println(digits3(33));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean evenDigits(int num) {

        int noOfDigits = digits1(num);

        if (noOfDigits % 2 == 0 && noOfDigits > 0) {
            return true;
        }
        return false;
    }

    static int digits1(int num) {
        int count = 0;

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Trick1 to find no of digits
    static int digits2(int num) {

        if (num < 0) {
            num = num * -1;
        }
        return Integer.valueOf(num).toString().length();
    }

    // Trick2 to find no of digits
    static int digits3(int num){
        if(num < 0 ){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }
        return (int)Math.log10(num) + 1;
    }


}

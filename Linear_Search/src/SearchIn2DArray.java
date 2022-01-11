import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] nums = {
                {2, 55, 37, 84},
                {36, 28, 99},
                {5, 41, 8, 35, 23, 62}
        };

        boolean out1 = searchIn2DArray1(nums, 36);
        int[] out2 = searchIn2DArray2(nums, 35);
        int out3 = findMaxIn2DArray2(nums);
        System.out.println(out1);
        System.out.println(Arrays.toString(out2));
        System.out.println(out3);
    }

    static boolean searchIn2DArray1(int[][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    static int[] searchIn2DArray2(int[][] arr, int target) {

        int[] ans = {-1, -1};
        if (arr.length == 0) {
            return ans;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    ans[0] = row;
                    ans[1] = col;
                    return ans;
                }
            }
        }

        return ans;
    }

    static int findMaxIn2DArray2(int[][] arr) {

        int max = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return max;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        return max;
    }

}

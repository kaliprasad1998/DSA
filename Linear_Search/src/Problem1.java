public class Problem1 {

  public static void main(String[] args) {
    int[] nums = {2, 5, 17, 33, 68, 94};

    int out = linearSearch(nums, 22);
    System.out.println(out);
  }

  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
}

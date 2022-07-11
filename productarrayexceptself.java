import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] findProductUsingDivision(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int[] right = new int[len];

        int[] ans = new int[len];

        left[0] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        right[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < len; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = { 4, 5, 7, 8, 9 };//test array.
        System.out.println(Arrays.toString(findProductUsingDivision(numbers)));
    }
    
}

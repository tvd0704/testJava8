package thread;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static int [] getMuls (int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int product = 1;
        for (int i = 0; i < n; i++) {
            result[i] = product;
            product *= nums[i];
        }
        product =1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= product;
            product *= nums[i];
        }

        return result;

    }
    public static void main(String[] args) {




    }
}


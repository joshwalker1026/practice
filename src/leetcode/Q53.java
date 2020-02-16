package leetcode;

import java.math.*;

public class Q53 {
    public static int solution(int[] nums) {
        int curMax = nums[0];
        int result = nums[0];

        for(int i=1; i< nums.length;i++) {
            curMax = Math.max(nums[i], curMax + nums[i]);

            result = Math.max(result, curMax);
        }

        return result;
    }


    public static void main(String args[]){

        System.out.println(solution(new int[]{3, 2, -6, 4, 0}));
        System.out.println(solution(new int[]{-3, -2, -6, -4, 0}));

    }
}

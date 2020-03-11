package leetcode;

public class Q1_TwoSum {
        public int[] twoSum(int[] nums, int target){
            java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
            int[] result = new int[2];

            for (int i=0; i < nums.length; i++) {
                if (map.get(nums[i]) !=null) {
                    result[0]=map.get(nums[i]);
                    result[1]=i;
                    break;
                }
                else {
                    map.put(target-nums[i], i);
                }
            }
            return result;
        }

}

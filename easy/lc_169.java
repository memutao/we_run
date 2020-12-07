import java.util.Arrays;

public class lc_169 {
    /**
     * 求数组中出现次数大于 length / 2 的数
     * 前提条件： 该数据一定存在
     */
    // 常规解法
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * 摩尔投票算法
     * 算法思想：每次删除两个不相同的数据，最后剩余的数据一定是出现次数大于 length / 2的
     */
    public static int majorityElement1(int[] nums) {
        int sum = 0, ans = -1;
        for (int num : nums) {
            if (sum == 0) ans = num;
            sum += ans == num ? 1 : -1;
        }
        return ans;
    }
}

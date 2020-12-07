import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 找出所有出现两次的元素
 * i <= a[i] <= n
 */
public class lc_442 {

    //常规解法
    public static List<Integer> findDuplicates_01(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 1;i < nums.length; i++){
            if (nums[i] == nums[i - 1]) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    /**
     * 算法思想：用元素作为index对其余元素进行标记（-1），当扫描到负数时，说明数据出现过
     *
     */
    public static List<Integer> findDuplicates_02(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                ans.add(Math.abs(nums[i]));
            }
            else {
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var test = new int[]{4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates_02(test));
    }


}

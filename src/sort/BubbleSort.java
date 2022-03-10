package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author wangcb （juzou@tuya.com）
 * @date 2:45 下午 2022/3/10
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 10, 20, 1, 5, -10, 100, 21};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}

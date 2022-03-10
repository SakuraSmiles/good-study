package sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author wangcb （juzou@tuya.com）
 * @date 3:05 下午 2022/3/10
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 10, 20, 1, 5, -10, 100, 21};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }
}

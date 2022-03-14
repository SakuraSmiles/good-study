package sort.impl;

import sort.ISort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author wangcb （juzou@tuya.com）
 * @date 2:45 下午 2022/3/10
 **/
public class BubbleSort implements ISort {
    @Override
    public void sort(int[] nums) {
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
